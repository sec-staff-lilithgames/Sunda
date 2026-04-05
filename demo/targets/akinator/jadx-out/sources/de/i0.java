package de;

import android.media.MediaDrm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class i0 implements MediaDrm.OnKeyStatusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52139b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f52138a = i10;
        this.f52139b = obj;
    }

    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        switch (this.f52138a) {
            case 0:
                ((com.google.android.exoplayer2.drm.f) this.f52139b).getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
                    arrayList.add(new b0(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                }
                throw null;
            default:
                ((sn.m0) this.f52139b).getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    MediaDrm.KeyStatus keyStatus2 = (MediaDrm.KeyStatus) it2.next();
                    arrayList2.add(new sn.c0(keyStatus2.getStatusCode(), keyStatus2.getKeyId()));
                }
                throw null;
        }
    }
}
