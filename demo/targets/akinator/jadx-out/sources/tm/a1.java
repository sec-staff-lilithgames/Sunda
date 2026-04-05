package tm;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum a1 {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);


    /* renamed from: b, reason: collision with root package name */
    public final int f86990b;

    a1(int i10) {
        this.f86990b = i10;
    }

    public static a1 fromJsString(String str) {
        return fromJsString(str, TopRight);
    }

    public int getGravity() {
        return this.f86990b;
    }

    public static a1 fromJsString(String str, a1 a1Var) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "center":
                    return Center;
                case "top-right":
                    return TopRight;
                case "top-left":
                    return TopLeft;
                case "bottom-left":
                    return BottomLeft;
                case "bottom-right":
                    return BottomRight;
                case "bottom-center":
                    return BottomCenter;
                case "top-center":
                    return TopCenter;
            }
        }
        return a1Var;
    }
}
