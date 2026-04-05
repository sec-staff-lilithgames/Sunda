package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2874ld extends U8 {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f33058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2874ld(Context context) {
        super(context, (byte) 1);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.U8
    public final void a(C2970r8 scrollableContainerAsset, V8 dataSource, int i10, int i11, N8 n82) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scrollableContainerAsset, "scrollableContainerAsset");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataSource, "dataSource");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f33058b = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(dataSource instanceof NativeRecyclerViewAdapter ? (NativeRecyclerViewAdapter) dataSource : null);
        addView(this.f33058b);
    }
}
