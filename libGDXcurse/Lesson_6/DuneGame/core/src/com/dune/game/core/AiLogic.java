package com.dune.game.core;

import com.dune.game.core.units.AbstractUnit;
import com.dune.game.core.units.UnitType;
import com.badlogic.gdx.math.Vector2;

import java.util.List;

public class AiLogic {

        private GameController gc;
        private List<AbstractUnit> aiUnits;
        private List<AbstractUnit> playerUnits;

        public AiLogic(GameController gameController) {
            this.gc = gameController;
        }

        public void update(float dt) {
            aiUnits = gc.getUnitsController().getAiUnits();
            for (AbstractUnit u: aiUnits) {
                if(u.getUnitType() == UnitType.BATTLE_TANK){
                    findTarget(u);
                }
            }
        }

        private void findTarget(AbstractUnit uid){
            AbstractUnit nextTarget = null;
            float dst = -1.0f;

            for(int i = 0; i < gc.getUnitsController().getPlayerUnits().size() - 1; i++) {
                AbstractUnit p = gc.getUnitsController().getPlayerUnits().get(i);

                if(i == 0){
                    dst = uid.getPosition().dst(p.getPosition());
                    nextTarget = p;
                }
                if(i > 0 && dst > uid.getPosition().dst(p.getPosition())){
                    dst = uid.getPosition().dst(p.getPosition());
                    nextTarget = p;
                }
            }


        }

    }

