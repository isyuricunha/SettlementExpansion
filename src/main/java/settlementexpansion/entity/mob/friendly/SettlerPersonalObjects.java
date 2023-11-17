package settlementexpansion.entity.mob.friendly;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum SettlerPersonalObjects {
    HUNTER(Collections.singletonList("dryingrack")),
    ANGLER(Arrays.asList("fishwalldisplay", "storagebox")),
    PAWNBROKER(Collections.singletonList("safebox")),
    EXPLORER(Collections.singletonList("cartographertable")),
    GUARD(Collections.singletonList("armorstand")),
    ALCHEMIST(Collections.singletonList("alchemytable")),
    BLACKSMITH(Arrays.asList("forge", "ironanvil")),
    FARMER(Arrays.asList("seedlingtable", "leathercarpet")),
    MAGE(Arrays.asList("studytable", "chair")),
    ANIMALKEEPER(Arrays.asList("leatherchair", "leathercarpet")),
    MINER(Arrays.asList("toolsrack", "storagebox")),
    GENERIC(Collections.emptyList());

    final List<String> objectList;

    SettlerPersonalObjects(List<String> furniture) {
        this.objectList = furniture;
    }

    public List<String> getObjects() {
        return objectList;
    }

    public static SettlerPersonalObjects getSettler(String id) {
        switch (id) {
            case "hunter": return HUNTER;
            case "angler": return ANGLER;
            case "pawnbroker": return PAWNBROKER;
            case "explorer": return EXPLORER;
            case "guard": return GUARD;
            case "alchemist": return ALCHEMIST;
            case "blacksmith": return BLACKSMITH;
            case "farmer": return FARMER;
            case "mage": return MAGE;
            case "animalkeeper": return ANIMALKEEPER;
            case "miner": return MINER;
            default: return GENERIC;
        }
    }

}