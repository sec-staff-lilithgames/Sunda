package z2;

import a3.i0;
import a3.x;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f97454a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f97455b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f97456c;

    public abstract void addValues(HashMap<String, x> map);

    @Override // 
    public abstract a clone();

    public a copy(a aVar) {
        this.f97454a = aVar.f97454a;
        this.f97455b = aVar.f97455b;
        return this;
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.f97454a;
    }

    @Override // a3.i0
    public abstract /* synthetic */ int getId(String str);

    public void setCustomAttribute(String str, int i10, float f10) {
        this.f97456c.put(str, new y2.c(str, i10, f10));
    }

    public void setFramePosition(int i10) {
        this.f97454a = i10;
    }

    @Override // a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f97454a = i11;
        return true;
    }

    public void setCustomAttribute(String str, int i10, int i11) {
        this.f97456c.put(str, new y2.c(str, i10, i11));
    }

    @Override // a3.i0
    public boolean setValue(int i10, float f10) {
        return false;
    }

    public void setCustomAttribute(String str, int i10, boolean z10) {
        this.f97456c.put(str, new y2.c(str, i10, z10));
    }

    @Override // a3.i0
    public boolean setValue(int i10, String str) {
        return i10 == 101;
    }

    public void setCustomAttribute(String str, int i10, String str2) {
        this.f97456c.put(str, new y2.c(str, i10, str2));
    }

    @Override // a3.i0
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public void setInterpolation(HashMap<String, Integer> map) {
    }

    public a setViewId(int i10) {
        return this;
    }
}
