package xl;

import io.bidmachine.protobuf.rendering.Rendering;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;
    public static final /* synthetic */ int[] $EnumSwitchMapping$5;
    public static final /* synthetic */ int[] $EnumSwitchMapping$6;

    static {
        int[] iArr = new int[Rendering.Orientation.values().length];
        try {
            iArr[Rendering.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Rendering.Orientation.ORIENTATION_LANDSCAPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Rendering.Orientation.ORIENTATION_SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Rendering.Orientation.ORIENTATION_INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Rendering.Orientation.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[Rendering.CacheType.values().length];
        try {
            iArr2[Rendering.CacheType.CACHE_TYPE_FULL_LOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Rendering.CacheType.CACHE_TYPE_PARTIAL_LOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Rendering.CacheType.CACHE_TYPE_STREAM_LOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Rendering.CacheType.CACHE_TYPE_INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Rendering.CacheType.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[Rendering.Phase.ViewComponent.ViewComponentType.values().length];
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_MRAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_LABEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_COUNTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_PROGRESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
        try {
            iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        $EnumSwitchMapping$3 = iArr4;
        int[] iArr5 = new int[Rendering.Image.ScaleType.values().length];
        try {
            iArr5[Rendering.Image.ScaleType.SCALE_TYPE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[Rendering.Image.ScaleType.SCALE_TYPE_TO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        $EnumSwitchMapping$4 = iArr5;
        int[] iArr6 = new int[Rendering.Phase.Event.EventName.values().length];
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_START.ordinal()] = 11;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE.ordinal()] = 12;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT.ordinal()] = 13;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE.ordinal()] = 14;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE.ordinal()] = 15;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE.ordinal()] = 16;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED.ordinal()] = 17;
        } catch (NoSuchFieldError unused41) {
        }
        $EnumSwitchMapping$5 = iArr6;
        int[] iArr7 = new int[Rendering.Phase.Event.Task.TaskName.values().length];
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW.ordinal()] = 8;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE.ordinal()] = 9;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS.ordinal()] = 10;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE.ordinal()] = 11;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY.ordinal()] = 12;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY.ordinal()] = 13;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN.ordinal()] = 14;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK.ordinal()] = 15;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET.ordinal()] = 16;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT.ordinal()] = 17;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS.ordinal()] = 18;
        } catch (NoSuchFieldError unused59) {
        }
        $EnumSwitchMapping$6 = iArr7;
    }
}
