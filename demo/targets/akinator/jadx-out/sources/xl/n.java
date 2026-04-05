package xl;

import br.b0;
import br.k1;
import br.l0;
import br.n0;
import br.u1;
import br.z1;
import io.bidmachine.protobuf.rendering.Rendering;
import kotlin.jvm.internal.e0;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n {
    public static final long getDurationMs(Rendering.AdaptiveAnimation.Timing timing) {
        e0.checkNotNullParameter(timing, "<this>");
        return mv.d.roundToLong(timing.getDuration() * 1000);
    }

    public static final br.c toAdElementType(Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        if (viewComponentType == null) {
            return null;
        }
        switch (m.$EnumSwitchMapping$2[viewComponentType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                nm.a.e(new b3(viewComponentType, 26));
                break;
        }
        return null;
    }

    public static final b0 toCacheType(final Rendering.CacheType cacheType) {
        if (cacheType == null) {
            return null;
        }
        int i10 = m.$EnumSwitchMapping$1[cacheType.ordinal()];
        if (i10 == 1) {
            return b0.FullLoad;
        }
        if (i10 == 2) {
            return b0.PartialLoad;
        }
        if (i10 == 3) {
            return b0.StreamLoad;
        }
        if (i10 == 4 || i10 == 5) {
            final int i11 = 0;
            nm.a.d(new rr.b() { // from class: xl.k
                @Override // rr.b
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return "Unsupported CacheType - " + cacheType.name();
                        default:
                            return "Unsupported CacheType - " + cacheType.name();
                    }
                }
            });
            return null;
        }
        final int i12 = 1;
        nm.a.e(new rr.b() { // from class: xl.k
            @Override // rr.b
            public final Object get() {
                switch (i12) {
                    case 0:
                        return "Unsupported CacheType - " + cacheType.name();
                    default:
                        return "Unsupported CacheType - " + cacheType.name();
                }
            }
        });
        return null;
    }

    public static final l0 toEventTaskType(Rendering.Phase.Event.Task.TaskName taskName) {
        if (taskName == null) {
            return null;
        }
        switch (m.$EnumSwitchMapping$6[taskName.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            default:
                nm.a.e(new b3(taskName, 25));
                break;
        }
        return null;
    }

    public static final n0 toEventType(Rendering.Phase.Event.EventName eventName) {
        if (eventName == null) {
            return null;
        }
        switch (m.$EnumSwitchMapping$5[eventName.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            default:
                nm.a.e(new b3(eventName, 27));
                break;
        }
        return null;
    }

    public static final k1 toOrientation(final Rendering.Orientation orientation) {
        if (orientation != null) {
            int i10 = m.$EnumSwitchMapping$0[orientation.ordinal()];
            if (i10 == 1) {
                return k1.Portrait;
            }
            if (i10 == 2) {
                return k1.Landscape;
            }
            if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    final int i11 = 1;
                    nm.a.e(new rr.b() { // from class: xl.l
                        @Override // rr.b
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return "Unsupported Orientation - " + orientation.name();
                                default:
                                    return "Unsupported Orientation - " + orientation.name();
                            }
                        }
                    });
                    return null;
                }
                final int i12 = 0;
                nm.a.d(new rr.b() { // from class: xl.l
                    @Override // rr.b
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return "Unsupported Orientation - " + orientation.name();
                            default:
                                return "Unsupported Orientation - " + orientation.name();
                        }
                    }
                });
            }
        }
        return null;
    }

    public static final u1 toScaleType(Rendering.Image.ScaleType scaleType) {
        if (scaleType == null) {
            return null;
        }
        int i10 = m.$EnumSwitchMapping$4[scaleType.ordinal()];
        if (i10 == 1) {
            return u1.None;
        }
        if (i10 == 2) {
            return u1.ToFill;
        }
        if (i10 == 3) {
            return u1.AspectFill;
        }
        if (i10 == 4) {
            return u1.AspectFit;
        }
        nm.a.e(new b3(scaleType, 24));
        return null;
    }

    public static final z1 toSideType(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        if (anchor == null) {
            return null;
        }
        int i10 = m.$EnumSwitchMapping$3[anchor.ordinal()];
        if (i10 == 1) {
            return z1.Left;
        }
        if (i10 == 2) {
            return z1.Right;
        }
        if (i10 == 3) {
            return z1.Top;
        }
        if (i10 == 4) {
            return z1.Bottom;
        }
        nm.a.e(new h(anchor, 1));
        return null;
    }
}
