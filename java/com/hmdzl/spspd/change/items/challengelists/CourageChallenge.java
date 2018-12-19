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
package com.hmdzl.spspd.change.items.challengelists;

import com.hmdzl.spspd.change.Statistics;
import com.hmdzl.spspd.change.actors.hero.Hero;
import com.hmdzl.spspd.change.sprites.ItemSpriteSheet;
import com.hmdzl.spspd.change.utils.GLog;

public class CourageChallenge extends ChallengeList {

	{
		//name = "journal page sokoban practice";
		image = ItemSpriteSheet.COURAGETRIAL;
		room=4;

		stackable = false;
	}
	
	@Override
	public int price() {
		if (!Statistics.amuletObtained){return 9000 * quantity;}
		else {return 300*quantity;}
	}	
}