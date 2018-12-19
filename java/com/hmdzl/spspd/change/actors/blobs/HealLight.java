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
 
package com.hmdzl.spspd.change.actors.blobs;

import com.hmdzl.spspd.change.actors.buffs.Buff;
import com.hmdzl.spspd.change.actors.hero.Hero;
import com.hmdzl.spspd.change.effects.Speck;
import com.hmdzl.spspd.change.messages.Messages;
import com.watabou.utils.Random;
import com.hmdzl.spspd.change.Dungeon;
import com.hmdzl.spspd.change.actors.Actor;
import com.hmdzl.spspd.change.actors.Char;
import com.hmdzl.spspd.change.actors.mobs.Bestiary;
import com.hmdzl.spspd.change.effects.BlobEmitter;
import com.hmdzl.spspd.change.effects.particles.ShaftParticle;
import com.hmdzl.spspd.change.items.Generator;
import com.hmdzl.spspd.change.items.Heap;
import com.hmdzl.spspd.change.levels.Level;
import com.hmdzl.spspd.change.levels.Terrain;
import com.hmdzl.spspd.change.scenes.GameScene;
import com.hmdzl.spspd.change.sprites.CharSprite;

public class HealLight extends Blob implements Hero.Doom{
	
	@Override
	protected void evolve() {

        super.evolve();

		Char ch;
		for (int i = 0; i < LENGTH; i++) {
			if (cur[i] > 0 && (ch = Actor.findChar(i)) != null) {
                if (ch.HP<ch.HT){
					ch.HP+=ch.HT/25;
					ch.sprite.emitter().start(Speck.factory(Speck.HEALING), 0.4f, 4);
				}
			}

        }
	}
	
	@Override
	public void use( BlobEmitter emitter ) {
		super.use(emitter);
		emitter.start(ShaftParticle.FACTORY, 1.0f, 0);
	}
	
	@Override
	public String tileDesc() {
		return Messages.get(this, "desc");
	}

    @Override
    public void onDeath() {

    }
}