package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C2970r8;
import com.inmobi.media.C3106z8;
import com.inmobi.media.N8;
import com.inmobi.media.S8;
import com.inmobi.media.V8;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class NativeRecyclerViewAdapter extends RecyclerView.a implements V8 {

    /* renamed from: a, reason: collision with root package name */
    public C3106z8 f31604a;

    /* renamed from: b, reason: collision with root package name */
    public N8 f31605b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f31606c;

    public NativeRecyclerViewAdapter(C3106z8 nativeDataModel, N8 nativeLayoutInflater) {
        e0.checkNotNullParameter(nativeDataModel, "nativeDataModel");
        e0.checkNotNullParameter(nativeLayoutInflater, "nativeLayoutInflater");
        this.f31604a = nativeDataModel;
        this.f31605b = nativeLayoutInflater;
        this.f31606c = new SparseArray();
    }

    public ViewGroup buildScrollableView(int i10, ViewGroup parent, C2970r8 root) throws IOException, IllegalArgumentException {
        N8 n82;
        e0.checkNotNullParameter(parent, "parent");
        e0.checkNotNullParameter(root, "pageContainerAsset");
        N8 n83 = this.f31605b;
        ViewGroup container = n83 != null ? n83.a(parent, root) : null;
        if (container != null && (n82 = this.f31605b) != null) {
            e0.checkNotNullParameter(container, "container");
            e0.checkNotNullParameter(parent, "parent");
            e0.checkNotNullParameter(root, "root");
            n82.b(container, root);
        }
        return container;
    }

    @Override // com.inmobi.media.V8
    public void destroy() {
        C3106z8 c3106z8 = this.f31604a;
        if (c3106z8 != null) {
            c3106z8.f33711l = null;
            c3106z8.f33706g = null;
        }
        this.f31604a = null;
        this.f31605b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        C3106z8 c3106z8 = this.f31604a;
        if (c3106z8 != null) {
            return c3106z8.d();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(S8 holder, int i10) throws IOException, IllegalArgumentException {
        View viewBuildScrollableView;
        e0.checkNotNullParameter(holder, "holder");
        C3106z8 c3106z8 = this.f31604a;
        C2970r8 c2970r8B = c3106z8 != null ? c3106z8.b(i10) : null;
        WeakReference weakReference = (WeakReference) this.f31606c.get(i10);
        if (c2970r8B != null) {
            if (weakReference == null || (viewBuildScrollableView = (View) weakReference.get()) == null) {
                viewBuildScrollableView = buildScrollableView(i10, holder.f32265a, c2970r8B);
            }
            if (viewBuildScrollableView != null) {
                if (i10 != getItemCount() - 1) {
                    holder.f32265a.setPadding(0, 0, 16, 0);
                }
                holder.f32265a.addView(viewBuildScrollableView);
                this.f31606c.put(i10, new WeakReference(viewBuildScrollableView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public S8 onCreateViewHolder(ViewGroup parent, int i10) {
        e0.checkNotNullParameter(parent, "parent");
        return new S8(new FrameLayout(parent.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(S8 holder) {
        e0.checkNotNullParameter(holder, "holder");
        holder.f32265a.removeAllViews();
        super.onViewRecycled((RecyclerView.n) holder);
    }
}
