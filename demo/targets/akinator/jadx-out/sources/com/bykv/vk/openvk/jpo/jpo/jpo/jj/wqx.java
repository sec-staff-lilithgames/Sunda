package com.bykv.vk.openvk.jpo.jpo.jpo.jj;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends my implements SurfaceHolder.Callback, jd {
    private static final ArrayList<jj> wqx = new ArrayList<>();

    /* renamed from: cm, reason: collision with root package name */
    private jd.jpo f16738cm;

    /* renamed from: jd, reason: collision with root package name */
    private jj f16739jd;
    private WeakReference<jpo> jpo;

    public wqx(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        jj jjVar = new jj(this);
        this.f16739jd = jjVar;
        wqx.add(jjVar);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(jd.jpo jpoVar) {
        this.f16738cm = jpoVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference<jpo> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().jpo(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<jpo> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().jpo(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<jpo> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().jd(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public void jpo(jpo jpoVar) {
        this.jpo = new WeakReference<>(jpoVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<jj> it = wqx.iterator();
        while (it.hasNext()) {
            jj next = it.next();
            if (next != null && next.jpo() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f16739jd);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public void jpo(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public View getView() {
        return this;
    }
}
