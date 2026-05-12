package StrategyPattern.GameCharacterAttack;

class GameCharacter {
    private AttackStrategy strategy;

    public void setAttackStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        strategy.attack();
    }
}
