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
package com.hmdzl.spspd.change.sprites;

import com.hmdzl.spspd.change.Assets;
import com.hmdzl.spspd.change.Dungeon;
import com.hmdzl.spspd.change.actors.Char;
import com.hmdzl.spspd.change.effects.Speck;
import com.hmdzl.spspd.change.levels.Level;
import com.watabou.noosa.TextureFilm;
import com.watabou.noosa.audio.Sample;
import com.watabou.noosa.particles.Emitter;

public class Xavier251998Sprite extends MobSprite {

	public Xavier251998Sprite() {
		super();

		texture( Assets.XAVIER );

		TextureFilm film = new TextureFilm(texture, 12, 15);

		idle = new Animation(1, true);
		idle.frames(film, 0, 1);

		run = new Animation(20, true);
		run.frames(film, 0,1,2,3);

		die = new Animation(20, false);
		die.frames(film,0,1,2,3);

		attack = new Animation(15, false);
		attack.frames(film, 0,1,2,3);
		
		play(idle);
    }


}
