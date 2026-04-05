package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum my {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int my;

    my(int i10) {
        this.my = i10;
    }

    public int jpo() {
        return this.my;
    }

    public static my jpo(int i10) {
        if (i10 == 0) {
            return COLUMN;
        }
        if (i10 == 1) {
            return COLUMN_REVERSE;
        }
        if (i10 == 2) {
            return ROW;
        }
        if (i10 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static my jpo(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
