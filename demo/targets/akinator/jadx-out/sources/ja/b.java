package ja;

import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;
import o9.ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDeck f69205a;

    public b(SwipeDeck swipeDeck) {
        this.f69205a = swipeDeck;
    }

    @Override // ja.h
    public void cardActionDown() {
        SwipeDeck swipeDeck = this.f69205a;
        e eVar = swipeDeck.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardActionDown();
        }
        swipeDeck.getClass();
    }

    @Override // ja.h
    public void cardActionUp() {
        SwipeDeck swipeDeck = this.f69205a;
        e eVar = swipeDeck.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardActionUp();
        }
        swipeDeck.getClass();
    }

    @Override // ja.h
    public void cardSwipedBottom() {
        SwipeDeck swipeDeck = this.f69205a;
        int childCount = swipeDeck.f21809n - swipeDeck.getChildCount();
        swipeDeck.c();
        e eVar = swipeDeck.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedBottom(childCount);
        }
        swipeDeck.a();
    }

    @Override // ja.h
    public void cardSwipedLeft() {
        SwipeDeck swipeDeck = this.f69205a;
        int childCount = swipeDeck.f21809n - swipeDeck.getChildCount();
        swipeDeck.c();
        e eVar = swipeDeck.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedLeft(childCount);
        }
        swipeDeck.a();
    }

    @Override // ja.h
    public void cardSwipedRight() {
        SwipeDeck swipeDeck = this.f69205a;
        int childCount = swipeDeck.f21809n - swipeDeck.getChildCount();
        swipeDeck.c();
        e eVar = swipeDeck.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedRight(childCount);
        }
        swipeDeck.a();
    }

    @Override // ja.h
    public boolean isDragEnabled() {
        e eVar = this.f69205a.f21806k;
        if (eVar != null) {
            return ((ba) eVar).isDragEnabled();
        }
        return true;
    }

    @Override // ja.h
    public void cardOffScreen() {
    }
}
