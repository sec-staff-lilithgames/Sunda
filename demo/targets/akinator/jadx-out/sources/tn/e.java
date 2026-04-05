package tn;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11) {
        super(i10, 1.0f, false);
        this.f87182b = i11;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f87182b;
    }
}
