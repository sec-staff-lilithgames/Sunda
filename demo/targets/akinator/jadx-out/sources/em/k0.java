package em;

import android.content.Context;
import com.explorestack.protobuf.Struct;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f54709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54710b;

    public k0(String str, String str2) {
        this.f54709a = str;
        this.f54710b = str2;
    }

    @Override // em.j0
    public abstract /* synthetic */ Struct getExt(Context context);

    @Override // em.j0
    public String getNetworkKey() {
        return this.f54709a;
    }

    @Override // em.j0
    public String getNetworkName() {
        return this.f54710b;
    }
}
