/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.hmdzl.spspd.change.items.skills;

import com.hmdzl.spspd.change.Assets;
import com.hmdzl.spspd.change.Dungeon;
import com.hmdzl.spspd.change.actors.Actor;
import com.hmdzl.spspd.change.actors.hero.Hero;
import com.hmdzl.spspd.change.actors.hero.HeroClass;
import com.hmdzl.spspd.change.actors.buffs.Buff;
import com.hmdzl.spspd.change.actors.buffs.Strength;
import com.hmdzl.spspd.change.actors.buffs.Haste;
import com.hmdzl.spspd.change.actors.buffs.Invisibility;
import com.hmdzl.spspd.change.effects.CellEmitter;
import com.hmdzl.spspd.change.effects.Speck;
import com.hmdzl.spspd.change.items.wands.WandOfBlood;
import com.hmdzl.spspd.change.levels.Level;
import com.hmdzl.spspd.change.scenes.CellSelector;
import com.hmdzl.spspd.change.scenes.GameScene;
import com.hmdzl.spspd.change.sprites.ItemSpriteSheet;
import com.hmdzl.spspd.change.utils.GLog;
import com.watabou.noosa.audio.Sample;
import com.hmdzl.spspd.change.messages.Messages;
import com.hmdzl.spspd.change.effects.particles.ElmoParticle;
import com.watabou.utils.Random;

public class RogueSkill extends ClassSkill {

	private static final String AC_SPECIAL = "Shadow Bless";

	{
		//name = "rogue garb";
		image = ItemSpriteSheet.ARMOR_ROGUE;
	}

	@Override
	public void doSpecial() {
		//GameScene.selectCell(teleporter);
		curUser.HP -= (curUser.HP / 2);
		
		curUser.spend(Actor.TICK);
		curUser.sprite.operate(curUser.pos);
		curUser.busy();
		
		curUser.sprite.centerEmitter().start(ElmoParticle.FACTORY, 0.15f, 4);
		Sample.INSTANCE.play(Assets.SND_READ);
		
		switch (Random.Int(4)){
			case 0:
		    Buff.affect(curUser, Strength.class);
			break;
			case 1:
			Buff.affect(curUser, Haste.class,15);
			break;
			case 2:
            Buff.affect(curUser, Invisibility.class,20);
			break;
			case 3:
			GLog.w(Messages.get(RogueSkill.class, "nothing"));
			break;
		}
	}

	/*protected static CellSelector.Listener teleporter = new CellSelector.Listener() {

		@Override
		public void onSelect(Integer target) {
			if (target != null) {

				if (!Level.fieldOfView[target]
						|| !(Level.passable[target] || Level.avoid[target])
						|| Actor.findChar(target) != null) {

					GLog.w(TXT_FOV);
					return;
				}

				curUser.HP -= (curUser.HP / 5);

				ScrollOfTeleportation.appear(curUser, target);
				CellEmitter.get(target).burst(Speck.factory(Speck.WOOL), 10);
				Sample.INSTANCE.play(Assets.SND_PUFF);
				Dungeon.level.press(target, curUser);
				Dungeon.observe();

				curUser.spendAndNext(Actor.TICK);
			}
		}

		@Override
		public String prompt() {
			return "Choose a location to jump to";
		}
	};*/
}