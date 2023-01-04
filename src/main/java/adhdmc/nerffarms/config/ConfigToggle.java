package adhdmc.nerffarms.config;

import adhdmc.nerffarms.NerfFarms;

public enum ConfigToggle {
    //Bypass toggles
    ONLY_NERF_HOSTILES(true),
    ALLOW_SKELETON_CREEPER_DAMAGE(true),
    ALLOW_WITHER_DAMAGE(true),
    ALLOW_FROG_SLIME_DAMAGE(true),
    ALLOW_FROG_MAGMA_CUBE_DAMAGE(true),
    ALLOW_IRON_GOLEM_DAMAGE(false),
    //Nerfing checks
    REQUIRE_PATH(true),
    REQUIRE_OPEN_SURROUNDINGS(true),
    REQUIRE_LINE_OF_SIGHT(true),
    ALLOW_PROJECTILE_DAMAGE(true),
    DROP_PLAYER_ITEMS(true);

    boolean toggle;
    ConfigToggle(boolean toggle){
        this.toggle = toggle;
    }

    public boolean isEnabled() {
        return toggle;
    }

    private void setEnabled(boolean toggle){
        this.toggle = toggle;
    }

    public static void reloadToggles(){
        ONLY_NERF_HOSTILES.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("only-nerf-hostiles"));
        ALLOW_SKELETON_CREEPER_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("skeletons-can-damage-creepers"));
        ALLOW_WITHER_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("withers-can-damage-entities"));
        ALLOW_FROG_MAGMA_CUBE_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("frogs-can-eat-slimes"));
        ALLOW_FROG_MAGMA_CUBE_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("frogs-can-eat-magma-cubes"));
        ALLOW_IRON_GOLEM_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("iron-golems-can-damage-entities"));
        REQUIRE_PATH.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("require-path"));
        REQUIRE_OPEN_SURROUNDINGS.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("require-open-surroundings"));
        REQUIRE_LINE_OF_SIGHT.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("require-line-of-sight"));
        ALLOW_PROJECTILE_DAMAGE.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("allow-projectile-damage"));
        DROP_PLAYER_ITEMS.setEnabled(NerfFarms.getInstance().getConfig().getBoolean("drop-player-items"));
    }
}
