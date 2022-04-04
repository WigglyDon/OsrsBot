package rsb.internal.globval;

import java.util.HashMap;
import java.util.Map;

public enum VarpValues {
    // Quest Clock Tower
    QUEST_CLOCK_TOWER_NOT_STARTED(0),
    QUEST_CLOCK_TOWER_STARTED(1),
    // TODO: states 2 - 6
    QUEST_CLOCK_TOWER_FINISHED(8),
    // Music play option
    MUSIC_PLAY_OPTION_MAN(0),
    MUSIC_PLAY_OPTION_AUTO(1),
    // Music looping
    MUSIC_LOOPING_DISABLED(0),
    MUSIC_LOOPING_ENABLED(1),
    // Quest Cook Assistant
    QUEST_COOK_ASSISTANT_NOT_STARTED(0),
    QUEST_COOK_ASSISTANT_STARTED(1),
    QUEST_COOK_ASSISTANT_FINISHED(2),
    // Quest Monks Friend
    QUEST_MONKS_FRIEND_NOT_STARTED(0),
    QUEST_MONKS_FRIEND_STARTED(10),
    // TODO: states 20 - 70
    QUEST_MONKS_FRIEND_FINISHED(80),
    // Quest Doric's Quest
    QUEST_DORICS_QUEST_NOT_STARTED(0),
    QUEST_DORICS_QUEST_STARTED(10),
    QUEST_DORICS_QUEST_FINISHED(100),
    // Quest Earnest The Chicken
    QUEST_EARNEST_THE_CHICKEN_NOT_STARTED(0),
    QUEST_EARNEST_THE_CHICKEN_STARTED(1),
    QUEST_EARNEST_THE_CHICKEN_TALKED_TO_PROF(2),
    QUEST_EARNEST_THE_CHICKEN_FINISHED(3),
    // Combat Style
    COMBAT_STYLE_FIRST(0),
    COMBAT_STYLE_SECOND(1),
    COMBAT_STYLE_THIRD(2),
    COMBAT_STYLE_FOURTH(3),
    COMBAT_STYLE_AUTOCAST(4),
    // Quest points
    QUEST_POINTS_NONE(0),
    QUEST_POINTS_MAX(287),
    // Selected autocast spell
    SELECTED_SPELL_WIND_STRIKE(3),
    SELECTED_SPELL_WATER_STRIKE(5),
    SELECTED_SPELL_EARTH_STRIKE(7),
    SELECTED_SPELL_FIRE_STRIKE(9),
    // Bank withdraw mode
    BANK_WITHDRAW_MODE_ITEM(0),
    BANK_WITHDRAW_MODE_NOTE(1),
    // Screen brightness
    SCREEN_BRIGHTNESS_MIN(0),
    SCREEN_BRIGHTNESS_MAX(100),
    // Music volume
    MUSIC_VOLUME_MIN(0),
    MUSIC_VOLUME_MAX(100),
    // Sound effects
    SOUND_EFFECTS_VOLUME_MIN(0),
    SOUND_EFFECTS_VOLUME_MAX(100),
    // Auto retaliate
    AUTO_RETALIATE_ENABLED(0),
    AUTO_RETALIATE_DISABLED(1),
    // Toggle run
    RUN_DISABLED(0),
    RUN_ENABLED(1),
    // Special attack energy
    SPECIAL_ATTACK_ENERGY_MIN(0),
    SPECIAL_ATTACK_ENERGY_MAX(100),
    // Special attack
    SPECIAL_ATTACK_DISABLED(0),
    SPECIAL_ATTACK_ENABLED(1),
    // Bank rearrange mode
    BANK_REARRANGE_MODE_SWAP(0),
    BANK_REARRANGE_MODE_INSERT(1),
    // Accept aid
    ACCEPT_AID_DISABLED(0),
    ACCEPT_AID_ENABLED(1),
    // Active Magic Book
    MAGIC_BOOK_STANDARD(0),
    // Area sound effects
    AREA_SOUND_EFFECT_VOLUME_MIN(0),
    AREA_SOUND_EFFECT_VOLUME_MAX(100);

    // cache values on load
    private static final Map<Object, Object> hashMap = new HashMap<>();
    static {
        for (VarpValues varpEnum : VarpValues.values()) {
            hashMap.put(varpEnum.value, varpEnum);
        }
    }

    private final int value;

    VarpValues(int value) {
        this.value = value;
    }

    public static VarpValues valueOf(int varpEnum) {
        return (VarpValues) hashMap.get(varpEnum);
    }

    public int getValue() {
        return value;
    }
}