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
package com.hmdzl.spspd.change.levels;

import com.watabou.utils.Random;

public class SokobanLayouts2 {
	
	//32X32
	private static final int W = Terrain.WALL;
	private static final int T = Terrain.SHRUB;
	private static final int Z = Terrain.HIGH_GRASS;
	private static final int D = Terrain.DOOR;
	private static final int L = Terrain.LOCKED_DOOR;
	
	//private static final int T = Terrain.INACTIVE_TRAP;

	private static final int E = Terrain.EMPTY;
	//private static final int X = Terrain.EXIT;

	//private static final int M = Terrain.WALL_DECO;
	//private static final int P = Terrain.PEDESTAL;
	
	private static final int A = Terrain.SOKOBAN_SHEEP;
	private static final int X = Terrain.CORNER_SOKOBAN_SHEEP;
	private static final int C = Terrain.SWITCH_SOKOBAN_SHEEP;
	private static final int B = Terrain.BLACK_SOKOBAN_SHEEP;
	private static final int H = Terrain.SOKOBAN_HEAP;
    private static final int I = Terrain.SOKOBAN_ITEM_REVEAL;
    private static final int F = Terrain.FLEECING_TRAP;
    private static final int U = Terrain.STATUE;
    private static final int G = Terrain.CHANGE_SHEEP_TRAP;
    private static final int S = Terrain.SECRET_DOOR;
    private static final int R = Terrain.PORT_WELL;
    private static final int V = Terrain.SOKOBAN_PORT_SWITCH;

		
	public static final int[] SOKOBAN_VAULT_LEVEL = {
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W
	};
	
	public static final int[] DRAGON_CAVE = {
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	H, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	H, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	H, 	H, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	H, 	H, 	H, 	H, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	H, 	H, 	H, 	H, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	H, 	H, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	H, 	E, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	E, 	H, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	S, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	E, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	H, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	W, 	W, 	W, 	E, 	W, 	W, 	E, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	H, 	E, 	E, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	H, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	H, 	E, 	E, 	E, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	H, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	E, 	E, 	E, 	E, 	E, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	F, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 
		W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W, 	W		
	};
	
}
