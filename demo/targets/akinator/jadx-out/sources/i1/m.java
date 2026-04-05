package i1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static final l RoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jCornerRadius = c.CornerRadius(f14, f15);
        return new l(f10, f11, f12, f13, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final l m4231RoundRectZAM2FJo(j rect, long j10, long j11, long j12, long j13) {
        e0.checkNotNullParameter(rect, "rect");
        return new l(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final l m4233RoundRectgG7oq9Y(float f10, float f11, float f12, float f13, long j10) {
        return RoundRect(f10, f11, f12, f13, b.m4156getXimpl(j10), b.m4157getYimpl(j10));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final l m4234RoundRectsniSvfs(j rect, long j10) {
        e0.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, b.m4156getXimpl(j10), b.m4157getYimpl(j10));
    }

    public static final j getBoundingRect(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return new j(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
    }

    public static final long getCenter(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return i.Offset((lVar.getWidth() / 2.0f) + lVar.getLeft(), (lVar.getHeight() / 2.0f) + lVar.getTop());
    }

    public static final float getMaxDimension(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return Math.max(Math.abs(lVar.getWidth()), Math.abs(lVar.getHeight()));
    }

    public static final float getMinDimension(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return Math.min(Math.abs(lVar.getWidth()), Math.abs(lVar.getHeight()));
    }

    public static final j getSafeInnerRect(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        float fMax = Math.max(b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()), b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()));
        float fMax2 = Math.max(b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()), b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()));
        return new j((fMax * 0.29289323f) + lVar.getLeft(), (fMax2 * 0.29289323f) + lVar.getTop(), lVar.getRight() - (Math.max(b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()), b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), lVar.getBottom() - (Math.max(b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()), b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return lVar.getWidth() == lVar.getHeight() && isEllipse(lVar);
    }

    public static final boolean isEllipse(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) && b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) && b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) && b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) && ((double) lVar.getWidth()) <= ((double) b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) lVar.getHeight()) <= ((double) b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isEmpty(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return lVar.getLeft() >= lVar.getRight() || lVar.getTop() >= lVar.getBottom();
    }

    public static final boolean isFinite(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        float left = lVar.getLeft();
        if (Float.isInfinite(left) || Float.isNaN(left)) {
            return false;
        }
        float top = lVar.getTop();
        if (Float.isInfinite(top) || Float.isNaN(top)) {
            return false;
        }
        float right = lVar.getRight();
        if (Float.isInfinite(right) || Float.isNaN(right)) {
            return false;
        }
        float bottom = lVar.getBottom();
        return (Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true;
    }

    public static final boolean isRect(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        if (b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) != 0.0f && b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) != 0.0f && b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) != 0.0f) {
            return false;
        }
        if (b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
            return b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == 0.0f || b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == 0.0f;
        }
        return false;
    }

    public static final boolean isSimple(l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) && b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) == b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs());
    }

    public static final l lerp(l start, l stop, float f10) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(stop, "stop");
        return new l(t2.a.lerp(start.getLeft(), stop.getLeft(), f10), t2.a.lerp(start.getTop(), stop.getTop(), f10), t2.a.lerp(start.getRight(), stop.getRight(), f10), t2.a.lerp(start.getBottom(), stop.getBottom(), f10), c.m4165lerp3Ry4LBc(start.m4229getTopLeftCornerRadiuskKHJgLs(), stop.m4229getTopLeftCornerRadiuskKHJgLs(), f10), c.m4165lerp3Ry4LBc(start.m4230getTopRightCornerRadiuskKHJgLs(), stop.m4230getTopRightCornerRadiuskKHJgLs(), f10), c.m4165lerp3Ry4LBc(start.m4228getBottomRightCornerRadiuskKHJgLs(), stop.m4228getBottomRightCornerRadiuskKHJgLs(), f10), c.m4165lerp3Ry4LBc(start.m4227getBottomLeftCornerRadiuskKHJgLs(), stop.m4227getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final l m4235translateUv8p0NA(l translate, long j10) {
        e0.checkNotNullParameter(translate, "$this$translate");
        return new l(h.m4185getXimpl(j10) + translate.getLeft(), h.m4186getYimpl(j10) + translate.getTop(), h.m4185getXimpl(j10) + translate.getRight(), h.m4186getYimpl(j10) + translate.getBottom(), translate.m4229getTopLeftCornerRadiuskKHJgLs(), translate.m4230getTopRightCornerRadiuskKHJgLs(), translate.m4228getBottomRightCornerRadiuskKHJgLs(), translate.m4227getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final l RoundRect(j rect, float f10, float f11) {
        e0.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11);
    }
}
