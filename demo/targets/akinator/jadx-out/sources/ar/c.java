package ar;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c extends a implements g {
    public c(List<g> list) {
        super(list);
    }

    @Override // ar.g
    public void onMediaCompleted() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaCompleted();
        }
    }

    @Override // ar.g
    public void onMediaFirstQuartile() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaFirstQuartile();
        }
    }

    @Override // ar.g
    public void onMediaMidpoint() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaMidpoint();
        }
    }

    @Override // ar.g
    public void onMediaPaused() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaPaused();
        }
    }

    @Override // ar.g
    public void onMediaResumed() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaResumed();
        }
    }

    @Override // ar.g
    public void onMediaSkipped() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaSkipped();
        }
    }

    @Override // ar.g
    public void onMediaStarted(float f10, float f11) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaStarted(f10, f11);
        }
    }

    @Override // ar.g
    public void onMediaThirdQuartile() {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaThirdQuartile();
        }
    }

    @Override // ar.g
    public void onMediaVolumeChanged(float f10) {
        Iterator it = this.f7924b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onMediaVolumeChanged(f10);
        }
    }
}
