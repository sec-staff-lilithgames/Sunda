package ej;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.r;
import hj.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import rj.n;
import rj.o;
import rj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f54407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ij.c f54408c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f54409e;

    public a(j jVar, Activity activity, ij.c cVar) {
        this.f54409e = jVar;
        this.f54407b = activity;
        this.f54408c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rj.l imageData;
        View.OnClickListener cVar;
        j jVar = this.f54409e;
        if (jVar.f54434m == null) {
            return;
        }
        Activity activity = this.f54407b;
        View.OnClickListener bVar = new b(jVar, activity);
        HashMap map = new HashMap();
        o oVar = jVar.f54434m;
        ArrayList arrayList = new ArrayList();
        int i10 = i.f54423a[oVar.getMessageType().ordinal()];
        if (i10 == 1) {
            arrayList.add(((rj.f) oVar).getAction());
        } else if (i10 == 2) {
            arrayList.add(((q) oVar).getAction());
        } else if (i10 == 3) {
            arrayList.add(((n) oVar).getAction());
        } else if (i10 != 4) {
            arrayList.add(rj.b.builder().build());
        } else {
            rj.k kVar = (rj.k) oVar;
            arrayList.add(kVar.getPrimaryAction());
            arrayList.add(kVar.getSecondaryAction());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rj.b bVar2 = (rj.b) it.next();
            if (bVar2 == null || TextUtils.isEmpty(bVar2.getActionUrl())) {
                t.logi("No action url found for action. Treating as dismiss.");
                cVar = bVar;
            } else {
                cVar = new c(jVar, bVar2, activity);
            }
            map.put(bVar2, cVar);
        }
        ij.c cVar2 = this.f54408c;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerInflate = cVar2.inflate(map, bVar);
        if (onGlobalLayoutListenerInflate != null) {
            cVar2.getImageView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerInflate);
        }
        o oVar2 = jVar.f54434m;
        if (oVar2.getMessageType() == MessageType.CARD) {
            rj.k kVar2 = (rj.k) oVar2;
            imageData = kVar2.getPortraitImageData();
            rj.l landscapeImageData = kVar2.getLandscapeImageData();
            if (jVar.f54431j.getResources().getConfiguration().orientation != 1 ? !(landscapeImageData == null || TextUtils.isEmpty(landscapeImageData.getImageUrl())) : !(imageData != null && !TextUtils.isEmpty(imageData.getImageUrl()))) {
                imageData = landscapeImageData;
            }
        } else {
            imageData = oVar2.getImageData();
        }
        h hVar = new h(jVar, cVar2, activity, onGlobalLayoutListenerInflate);
        if (imageData == null || TextUtils.isEmpty(imageData.getImageUrl())) {
            hVar.onSuccess();
        } else {
            jVar.f54426e.load(imageData.getImageUrl()).addErrorListener(new r(jVar.f54434m, jVar.f54435n)).tag(activity.getClass()).placeholder(R.drawable.image_placeholder).into(cVar2.getImageView(), hVar);
        }
    }
}
