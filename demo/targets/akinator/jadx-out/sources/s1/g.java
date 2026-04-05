package s1;

import android.view.KeyEvent;
import e1.v;
import h1.s;
import h1.x;
import h1.z0;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import x1.d0;
import x1.l1;
import z1.b0;
import z1.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements y1.b, y1.d, l1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f85311b;

    /* renamed from: c, reason: collision with root package name */
    public final l f85312c;

    /* renamed from: e, reason: collision with root package name */
    public s f85313e;

    /* renamed from: f, reason: collision with root package name */
    public g f85314f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f85315g;

    public g(l lVar, l lVar2) {
        this.f85311b = lVar;
        this.f85312c = lVar2;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(l lVar) {
        return super.any(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return i.getModifierLocalKeyInput();
    }

    public final b0 getLayoutNode() {
        return this.f85315g;
    }

    public final l getOnKeyEvent() {
        return this.f85311b;
    }

    public final l getOnPreviewKeyEvent() {
        return this.f85312c;
    }

    public final g getParent() {
        return this.f85314f;
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        r0.c keyInputChildren;
        r0.c keyInputChildren2;
        e0.checkNotNullParameter(scope, "scope");
        s sVar = this.f85313e;
        if (sVar != null && (keyInputChildren2 = sVar.getKeyInputChildren()) != null) {
            keyInputChildren2.remove(this);
        }
        s sVar2 = (s) scope.getCurrent(x.getModifierLocalParentFocusModifier());
        this.f85313e = sVar2;
        if (sVar2 != null && (keyInputChildren = sVar2.getKeyInputChildren()) != null) {
            keyInputChildren.add(this);
        }
        this.f85314f = (g) scope.getCurrent(i.getModifierLocalKeyInput());
    }

    @Override // x1.l1
    public void onPlaced(d0 coordinates) {
        e0.checkNotNullParameter(coordinates, "coordinates");
        this.f85315g = ((u0) coordinates).getLayoutNode$ui_release();
    }

    /* renamed from: processKeyInput-ZmokQxo, reason: not valid java name */
    public final boolean m6720processKeyInputZmokQxo(KeyEvent keyEvent) {
        s sVarFindActiveFocusNode;
        g gVarFindLastKeyInputModifier;
        e0.checkNotNullParameter(keyEvent, "keyEvent");
        s sVar = this.f85313e;
        if (sVar == null || (sVarFindActiveFocusNode = z0.findActiveFocusNode(sVar)) == null || (gVarFindLastKeyInputModifier = z0.findLastKeyInputModifier(sVarFindActiveFocusNode)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.");
        }
        if (gVarFindLastKeyInputModifier.m6722propagatePreviewKeyEventZmokQxo(keyEvent)) {
            return true;
        }
        return gVarFindLastKeyInputModifier.m6721propagateKeyEventZmokQxo(keyEvent);
    }

    /* renamed from: propagateKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m6721propagateKeyEventZmokQxo(KeyEvent keyEvent) {
        e0.checkNotNullParameter(keyEvent, "keyEvent");
        l lVar = this.f85311b;
        Boolean bool = lVar != null ? (Boolean) lVar.invoke(c.m6696boximpl(keyEvent)) : null;
        if (e0.areEqual(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        g gVar = this.f85314f;
        if (gVar != null) {
            return gVar.m6721propagateKeyEventZmokQxo(keyEvent);
        }
        return false;
    }

    /* renamed from: propagatePreviewKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m6722propagatePreviewKeyEventZmokQxo(KeyEvent keyEvent) {
        e0.checkNotNullParameter(keyEvent, "keyEvent");
        g gVar = this.f85314f;
        Boolean boolValueOf = gVar != null ? Boolean.valueOf(gVar.m6722propagatePreviewKeyEventZmokQxo(keyEvent)) : null;
        if (e0.areEqual(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        l lVar = this.f85312c;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(c.m6696boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public g getValue() {
        return this;
    }
}
