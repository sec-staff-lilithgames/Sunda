package a2;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface q5 extends z1.b2 {
    @Override // z1.b2
    /* synthetic */ s2.e getDensity();

    boolean getHasPendingMeasureOrLayout();

    @Override // z1.b2
    /* synthetic */ e2.e0 getSemanticsOwner();

    @Override // z1.b2
    /* synthetic */ m2.l0 getTextInputService();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    @Override // z1.b2
    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    /* synthetic */ boolean mo53sendKeyEventZmokQxo(KeyEvent keyEvent);
}
