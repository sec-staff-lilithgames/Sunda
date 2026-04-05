package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f98881a;

    public s(Class cls) {
        this.f98881a = cls;
    }

    @Override // zw.h0
    public Enum read(String str) throws Exception {
        return Enum.valueOf(this.f98881a, str);
    }

    @Override // zw.h0
    public String write(Enum r12) throws Exception {
        return r12.name();
    }
}
