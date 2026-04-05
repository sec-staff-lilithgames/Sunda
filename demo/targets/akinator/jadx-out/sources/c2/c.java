package c2;

import android.R;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum c {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f11740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11741c;

    c(int i10) {
        this.f11740b = i10;
        this.f11741c = i10;
    }

    public final int getId() {
        return this.f11740b;
    }

    public final int getOrder() {
        return this.f11741c;
    }

    public final int getTitleResource() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        throw new t();
    }
}
