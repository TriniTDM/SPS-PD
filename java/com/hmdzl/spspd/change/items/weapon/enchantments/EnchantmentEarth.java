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
package com.hmdzl.spspd.change.items.weapon.enchantments;

import com.hmdzl.spspd.change.actors.Char;
import com.hmdzl.spspd.change.actors.buffs.Buff;
import com.hmdzl.spspd.change.actors.buffs.GrowSeed;
import com.hmdzl.spspd.change.actors.buffs.Roots;
import com.hmdzl.spspd.change.actors.buffs.Weakness;
import com.hmdzl.spspd.change.effects.CellEmitter;
import com.hmdzl.spspd.change.effects.particles.EarthParticle;
import com.hmdzl.spspd.change.effects.particles.ShadowParticle;
import com.hmdzl.spspd.change.items.misc.FourClover;
import com.hmdzl.spspd.change.items.weapon.Weapon;
import com.hmdzl.spspd.change.items.weapon.melee.relic.RelicMeleeWeapon;
import com.hmdzl.spspd.change.sprites.ItemSprite;
import com.hmdzl.spspd.change.sprites.ItemSprite.Glowing;
import com.watabou.utils.Random;

public class EnchantmentEarth extends Weapon.Enchantment {

	private static ItemSprite.Glowing BROWN = new ItemSprite.Glowing( 0x996600 );

	@Override
	public boolean proc(RelicMeleeWeapon weapon, Char attacker, Char defender, int damage) {
		return false;
	}
	
	@Override
	public boolean proc(Weapon weapon, Char attacker, Char defender, int damage) {
		// lvl 0 - 33%
		// lvl 1 - 50%
		// lvl 2 - 60%
		FourClover.FourCloverBless fcb = attacker.buff(FourClover.FourCloverBless.class);
		int level = Math.max(0, weapon.level);

		int dmg = damage;
		defender.damage(Random.Int(dmg/6), this);
				if(fcb != null && Random.Int(2) == 1){
			defender.damage(Random.Int(dmg/6), this);
		}

		if (Random.Int(level + 15) >= 30) {
			Buff.affect(defender, GrowSeed.class).reignite(defender);
			CellEmitter.bottom(defender.pos).start(EarthParticle.FACTORY, 0.05f, 8);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Glowing glowing() {
		return BROWN;
	}

}
