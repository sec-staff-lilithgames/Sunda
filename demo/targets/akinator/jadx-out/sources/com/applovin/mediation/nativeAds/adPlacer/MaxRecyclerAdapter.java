package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.c5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxRecyclerAdapter extends RecyclerView.a implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f16488a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.a f16489b;

    /* renamed from: c, reason: collision with root package name */
    private final b f16490c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f16491d;

    /* renamed from: e, reason: collision with root package name */
    private c5 f16492e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f16493f;

    /* renamed from: g, reason: collision with root package name */
    private int f16494g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f16495h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f16497a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f16497a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f16497a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements c5.a {
        public a() {
        }

        @Override // com.applovin.impl.c5.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f16488a.updateFillablePositions(i10, Math.min(MaxRecyclerAdapter.this.f16494g + i11, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends RecyclerView.b {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f16488a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f16488a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f16489b.getItemCount();
            if (MaxRecyclerAdapter.this.f16495h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f16495h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f16488a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f16488a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f16489b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f16495h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f16495h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f16488a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f16488a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f16488a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f16488a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f16488a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.a aVar, Activity activity) {
        b bVar = new b(this, null);
        this.f16490c = bVar;
        this.f16494g = 8;
        this.f16495h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f16488a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(aVar.hasStableIds());
        this.f16489b = aVar;
        aVar.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f16489b.unregisterAdapterDataObserver(this.f16490c);
        } catch (Exception unused) {
        }
        this.f16488a.destroy();
        c5 c5Var = this.f16492e;
        if (c5Var != null) {
            c5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f16488a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f16488a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f16488a.getAdjustedCount(this.f16489b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i10) {
        if (this.f16489b.hasStableIds()) {
            return this.f16488a.isFilledPosition(i10) ? this.f16488a.getAdItemId(i10) : this.f16489b.getItemId(this.f16488a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        if (this.f16488a.isAdPosition(i10)) {
            return -42;
        }
        return this.f16489b.getItemViewType(this.f16488a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f16488a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f16488a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f16493f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f16493f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f16493f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f16493f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f16491d = recyclerView;
        c5 c5Var = new c5(recyclerView);
        this.f16492e = c5Var;
        c5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.n nVar, int i10) {
        this.f16492e.a(nVar.itemView, i10);
        if (!this.f16488a.isAdPosition(i10)) {
            this.f16489b.onBindViewHolder(nVar, this.f16488a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f16488a.getAdSize(i10);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) nVar).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f16488a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.n onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f16489b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.f layoutManager = this.f16491d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f16491d = null;
        c5 c5Var = this.f16492e;
        if (c5Var != null) {
            c5Var.a();
            this.f16492e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.n nVar) {
        return nVar instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(nVar) : this.f16489b.onFailedToRecycleView(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.n nVar) {
        if (nVar instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(nVar);
        } else {
            this.f16489b.onViewAttachedToWindow(nVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.n nVar) {
        if (nVar instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(nVar);
        } else {
            this.f16489b.onViewDetachedFromWindow(nVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.n nVar) {
        c5 c5Var = this.f16492e;
        if (c5Var != null) {
            c5Var.b(nVar.itemView);
        }
        if (!(nVar instanceof MaxAdRecyclerViewHolder)) {
            this.f16489b.onViewRecycled(nVar);
            return;
        }
        if (this.f16488a.isFilledPosition(nVar.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) nVar).getContainerView().removeAllViews();
        }
        super.onViewRecycled(nVar);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f16495h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f16489b.unregisterAdapterDataObserver(this.f16490c);
        this.f16489b.setHasStableIds(z10);
        this.f16489b.registerAdapterDataObserver(this.f16490c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f16493f = listener;
    }

    public void setLookAhead(int i10) {
        this.f16494g = i10;
    }
}
