import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new MachineGun(),
                new Rpg(),
                new MachineGun(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shootWithWeapon(int slot) {
        if (slot >= getSlotsCount() || slot < 0){
            System.out.println("Выбран неверный слот оружия!");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
