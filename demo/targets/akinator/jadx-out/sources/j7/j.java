package j7;

import coil.memory.MemoryCache$Key;
import j7.i;
import z.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f69169a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10, i iVar) {
        super(i10);
        this.f69169a = iVar;
    }

    @Override // z.b0
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        i.a aVar = (i.a) obj2;
        this.f69169a.f69164a.set((MemoryCache$Key) obj, aVar.getBitmap(), aVar.getExtras(), aVar.getSize());
    }

    @Override // z.b0
    public int sizeOf(Object obj, Object obj2) {
        return ((i.a) obj2).getSize();
    }
}
