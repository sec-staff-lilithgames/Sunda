package a7;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements g {
    @Override // a7.g
    public void decodeEnd(l7.i iVar, c7.k kVar, l7.o oVar, c7.g gVar) {
        d.decodeEnd(this, iVar, kVar, oVar, gVar);
    }

    @Override // a7.g
    public void decodeStart(l7.i iVar, c7.k kVar, l7.o oVar) {
        d.decodeStart(this, iVar, kVar, oVar);
    }

    @Override // a7.g
    public void fetchEnd(l7.i iVar, f7.i iVar2, l7.o oVar, f7.g gVar) {
        d.fetchEnd(this, iVar, iVar2, oVar, gVar);
    }

    @Override // a7.g
    public void fetchStart(l7.i iVar, f7.i iVar2, l7.o oVar) {
        d.fetchStart(this, iVar, iVar2, oVar);
    }

    @Override // a7.g
    public void keyEnd(l7.i iVar, String str) {
        d.keyEnd(this, iVar, str);
    }

    @Override // a7.g
    public void keyStart(l7.i iVar, Object obj) {
        d.keyStart(this, iVar, obj);
    }

    @Override // a7.g
    public void mapEnd(l7.i iVar, Object obj) {
        d.mapEnd(this, iVar, obj);
    }

    @Override // a7.g
    public void mapStart(l7.i iVar, Object obj) {
        d.mapStart(this, iVar, obj);
    }

    @Override // a7.g, l7.j
    public void onCancel(l7.i iVar) {
        d.onCancel(this, iVar);
    }

    @Override // a7.g, l7.j
    public void onError(l7.i iVar, l7.f fVar) {
        d.onError(this, iVar, fVar);
    }

    @Override // a7.g, l7.j
    public void onStart(l7.i iVar) {
        d.onStart(this, iVar);
    }

    @Override // a7.g, l7.j
    public void onSuccess(l7.i iVar, l7.s sVar) {
        d.onSuccess(this, iVar, sVar);
    }

    @Override // a7.g
    public void resolveSizeEnd(l7.i iVar, m7.j jVar) {
        d.resolveSizeEnd(this, iVar, jVar);
    }

    @Override // a7.g
    public void resolveSizeStart(l7.i iVar) {
        d.resolveSizeStart(this, iVar);
    }

    @Override // a7.g
    public void transformEnd(l7.i iVar, Bitmap bitmap) {
        d.transformEnd(this, iVar, bitmap);
    }

    @Override // a7.g
    public void transformStart(l7.i iVar, Bitmap bitmap) {
        d.transformStart(this, iVar, bitmap);
    }

    @Override // a7.g
    public void transitionEnd(l7.i iVar, p7.d dVar) {
        d.transitionEnd(this, iVar, dVar);
    }

    @Override // a7.g
    public void transitionStart(l7.i iVar, p7.d dVar) {
        d.transitionStart(this, iVar, dVar);
    }
}
