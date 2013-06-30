package com.candb.frogger.elements;

import com.candb.frogger.Game;
import com.candb.frogger.sprites.TierSprite;


public class Vehicle extends TierSprite {
	
	public Vehicle (String skinName, int skinIndex, Game game, float x, float y) {
		
		super(game, x, y);
		
		this._game = game;
		active = true;
		visible = true;
		
		setSkin (skinName, skinIndex);
		
		game.screen.elements.add(this);
	}

}
