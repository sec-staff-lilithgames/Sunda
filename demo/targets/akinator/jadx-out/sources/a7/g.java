package a7;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g extends l7.j {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4100a = new c();

    void decodeEnd(l7.i iVar, c7.k kVar, l7.o oVar, c7.g gVar);

    void decodeStart(l7.i iVar, c7.k kVar, l7.o oVar);

    void fetchEnd(l7.i iVar, f7.i iVar2, l7.o oVar, f7.g gVar);

    void fetchStart(l7.i iVar, f7.i iVar2, l7.o oVar);

    void keyEnd(l7.i iVar, String str);

    void keyStart(l7.i iVar, Object obj);

    void mapEnd(l7.i iVar, Object obj);

    void mapStart(l7.i iVar, Object obj);

    @Override // l7.j
    void onCancel(l7.i iVar);

    @Override // l7.j
    void onError(l7.i iVar, l7.f fVar);

    @Override // l7.j
    void onStart(l7.i iVar);

    @Override // l7.j
    void onSuccess(l7.i iVar, l7.s sVar);

    void resolveSizeEnd(l7.i iVar, m7.j jVar);

    void resolveSizeStart(l7.i iVar);

    void transformEnd(l7.i iVar, Bitmap bitmap);

    void transformStart(l7.i iVar, Bitmap bitmap);

    void transitionEnd(l7.i iVar, p7.d dVar);

    void transitionStart(l7.i iVar, p7.d dVar);
}
