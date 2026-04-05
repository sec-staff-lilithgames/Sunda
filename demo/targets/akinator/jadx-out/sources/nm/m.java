package nm;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.BidMachine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f77061b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f77062c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f77063e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f77064f;

    static {
        m mVar = new m(BidMachine.NAME, 0);
        f77061b = mVar;
        m mVar2 = new m(AndroidInitializeBoldSDK.MSG_NETWORK, 1);
        f77062c = mVar2;
        m mVar3 = new m("All", 2);
        f77063e = mVar3;
        f77064f = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f77064f.clone();
    }
}
