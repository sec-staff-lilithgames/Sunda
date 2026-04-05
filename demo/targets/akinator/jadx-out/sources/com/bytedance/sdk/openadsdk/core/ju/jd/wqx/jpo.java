package com.bytedance.sdk.openadsdk.core.ju.jd.wqx;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.adsdk.ugeno.yoga.jd.wqx;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private cm f20494cm;

    /* renamed from: jd, reason: collision with root package name */
    private final List<wqx> f20495jd;
    private final RecyclerView jpo;
    private final C0127jpo wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd extends RecyclerView.n {
        private final ViewGroup jpo;

        public jd(View view) {
            super(view);
            this.jpo = (ViewGroup) view;
        }

        public void jpo(wqx wqxVar) {
            View viewJu = wqxVar.ju();
            ViewParent parent = viewJu.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewJu);
            }
            this.jpo.removeAllViews();
            this.jpo.addView(viewJu, new wqx.jpo(wqxVar.duq(), wqxVar.dm()));
        }
    }

    public jpo(Context context) {
        super(context);
        this.f20495jd = new CopyOnWriteArrayList();
        C0127jpo c0127jpo = new C0127jpo();
        this.wqx = c0127jpo;
        RecyclerView recyclerView = new RecyclerView(context);
        this.jpo = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0127jpo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.f20494cm;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.f20494cm;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.f20494cm;
        if (cmVar != null) {
            cmVar.jj();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        cm cmVar2 = this.f20494cm;
        if (cmVar2 != null) {
            cmVar2.jpo(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        cm cmVar = this.f20494cm;
        if (cmVar != null) {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            super.onMeasure(iArrJpo[0], iArrJpo[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        cm cmVar2 = this.f20494cm;
        if (cmVar2 != null) {
            cmVar2.my();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.f20494cm;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            this.jpo.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.jpo.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
        if (wqxVar == null) {
            return;
        }
        this.f20495jd.add(wqxVar);
        C0127jpo c0127jpo = this.wqx;
        if (c0127jpo != null) {
            c0127jpo.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ju.jd.wqx.jpo$jpo, reason: collision with other inner class name */
    public class C0127jpo extends RecyclerView.a {
        private C0127jpo() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return jpo.this.f20495jd.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public jd onCreateViewHolder(ViewGroup viewGroup, int i10) {
            com.bytedance.adsdk.ugeno.yoga.jd.wqx wqxVar = new com.bytedance.adsdk.ugeno.yoga.jd.wqx(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.jd.wqx wqxVar2 = (com.bytedance.adsdk.ugeno.jd.wqx) jpo.this.f20495jd.get(i10);
            wqxVar.setLayoutParams(new ViewGroup.LayoutParams(wqxVar2.duq(), wqxVar2.dm()));
            return new jd(wqxVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(jd jdVar, int i10) {
            jdVar.jpo((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this.f20495jd.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return i10;
        }
    }

    public void jpo(cm cmVar) {
        this.f20494cm = cmVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.ju.jd.wqx.jd jdVar) {
        ViewGroup.LayoutParams layoutParams = this.jpo.getLayoutParams();
        layoutParams.width = jdVar.duq();
        layoutParams.height = jdVar.dm();
        this.jpo.setLayoutParams(layoutParams);
    }
}
