package StrategyPattern.GameCharacterAttack;

class SwordAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Sword");
    }
}

class GunAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Gun");
    }
}

class MagicAttack implements AttackStrategy {
    public void attack() {
        System.out.println("Attacking with Magic");
    }
}