package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.subjectfactory.a;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.viewobserver.i;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f40107g;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.d f40108a = (com.mbridge.msdk.dycreator.viewobserver.d) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.VIEW_OBSERVER);

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.c f40109b = (com.mbridge.msdk.dycreator.viewobserver.c) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.CLICK_OBSERVER);

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.f f40110c = (com.mbridge.msdk.dycreator.viewobserver.f) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.EFFECT_OBSERVER);

    /* renamed from: d, reason: collision with root package name */
    private h f40111d = (h) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.REPORT_OBSERVER);

    /* renamed from: e, reason: collision with root package name */
    private BaseViewModel f40112e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f40113f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.dycreator.viewobserver.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40114a;

        public a(View view) {
            this.f40114a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.g
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f40114a;
                if (callback instanceof InterBase) {
                    b.this.b((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                p0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.binding.b$b, reason: collision with other inner class name */
    public class C0259b implements com.mbridge.msdk.dycreator.viewobserver.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40116a;

        public C0259b(View view) {
            this.f40116a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.e
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f40116a;
                if (callback instanceof InterBase) {
                    b.this.a((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                p0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40118a;

        public c(View view) {
            this.f40118a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.i
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f40118a;
                if (callback instanceof InterBase) {
                    b.this.c((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                p0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.dycreator.viewobserver.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40120a;

        public d(View view) {
            this.f40120a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.b
        public void a(Object obj) {
            if (obj == null) {
                return;
            }
            try {
                if (com.mbridge.msdk.dycreator.utils.d.a(this.f40120a, (com.mbridge.msdk.dycreator.viewdata.base.a) obj)) {
                    b.this.a(this.f40120a, obj);
                }
            } catch (Exception e10) {
                p0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements DyCountDownListenerWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f40125d;

        public e(boolean z10, String str, String str2, View view) {
            this.f40122a = z10;
            this.f40123b = str;
            this.f40124c = str2;
            this.f40125d = view;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper
        public void getCountDownValue(int i10) {
            if (i10 != 0) {
                ((TextView) this.f40125d).setText(com.mbridge.msdk.dycreator.utils.d.a(this.f40122a, i10, this.f40123b, this.f40124c));
            } else {
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.dycreator.viewdata.base.a f40127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f40128b;

        public f(com.mbridge.msdk.dycreator.viewdata.base.a aVar, View view) {
            this.f40127a = aVar;
            this.f40128b = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            View view = this.f40128b;
            if (view != null) {
                ((ImageView) view).setBackgroundColor(-7829368);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        boolean z10 = bitmap.getWidth() > bitmap.getHeight();
                        if ((this.f40127a.getEffectData().getOrientation() == 1 ? this.f40128b.getResources().getConfiguration().orientation : this.f40127a.getEffectData().getOrientation()) == 1) {
                            if (z10) {
                                View view = this.f40128b;
                                if (view instanceof MBSplashPortView) {
                                    if (view.getParent() != null) {
                                        ((ViewGroup) this.f40128b.getParent()).setVisibility(8);
                                        return;
                                    }
                                    return;
                                } else if (view instanceof MBSplashImageBgView) {
                                    view.setVisibility(0);
                                    Bitmap bitmapA = o0.a(bitmap);
                                    ((MBSplashImageBgView) this.f40128b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f40128b).setImageBitmap(bitmapA);
                                    return;
                                }
                            } else {
                                View view2 = this.f40128b;
                                if (view2 instanceof MBSplashPortView) {
                                    view2.setVisibility(0);
                                    ((MBSplashPortView) this.f40128b).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    ((MBSplashPortView) this.f40128b).setImageBitmap(bitmap);
                                    return;
                                } else if (view2 instanceof MBSplashImageBgView) {
                                    view2.setVisibility(8);
                                    return;
                                } else if (view2 instanceof InterBase) {
                                    String effectDes = ((InterBase) view2).getEffectDes();
                                    ViewGroup viewGroup = (ViewGroup) this.f40128b.getParent();
                                    if (viewGroup != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes, viewGroup, true);
                                    }
                                }
                            }
                        } else if (z10) {
                            View view3 = this.f40128b;
                            if (view3 instanceof MBSplashPortView) {
                                view3.setVisibility(0);
                                ((MBSplashPortView) this.f40128b).setScaleType(ImageView.ScaleType.FIT_XY);
                                ((ImageView) this.f40128b).setImageBitmap(bitmap);
                                return;
                            } else if (view3 instanceof MBSplashImageBgView) {
                                view3.setVisibility(8);
                                ((MBSplashImageBgView) this.f40128b).setImageBitmap(o0.a(bitmap));
                                return;
                            } else if (view3 instanceof InterBase) {
                                String effectDes2 = ((InterBase) view3).getEffectDes();
                                ViewGroup viewGroup2 = (ViewGroup) this.f40128b.getParent();
                                if (viewGroup2 != null) {
                                    com.mbridge.msdk.dycreator.utils.d.a(effectDes2, viewGroup2, true);
                                }
                            }
                        } else {
                            View view4 = this.f40128b;
                            if (view4 instanceof MBSplashPortView) {
                                view4.setVisibility(0);
                                ((MBSplashPortView) this.f40128b).setImageBitmap(bitmap);
                                return;
                            } else {
                                if (view4 instanceof MBSplashImageBgView) {
                                    view4.setVisibility(0);
                                    Bitmap bitmapA2 = o0.a(bitmap);
                                    ((MBSplashImageBgView) this.f40128b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f40128b).setImageBitmap(bitmapA2);
                                    return;
                                }
                                if (view4 instanceof InterBase) {
                                    String effectDes3 = ((InterBase) view4).getEffectDes();
                                    ViewGroup viewGroup3 = (ViewGroup) this.f40128b.getParent();
                                    if (viewGroup3 != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes3, viewGroup3, true);
                                    }
                                }
                            }
                        }
                        ((ImageView) this.f40128b).setImageBitmap(bitmap);
                        return;
                    }
                } catch (Exception e10) {
                    p0.b("MBDataBinding", e10.getMessage());
                    return;
                }
            }
            ((ImageView) this.f40128b).setBackgroundColor(-7829368);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends com.mbridge.msdk.shake.b {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f40130g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ MBSplashData f40131h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, int i11, View view, MBSplashData mBSplashData) {
            super(i10, i11);
            this.f40130g = view;
            this.f40131h = mBSplashData;
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            View view = this.f40130g;
            if (view != null) {
                try {
                    if (view.getGlobalVisibleRect(new Rect())) {
                        SplashResData splashResData = new SplashResData();
                        this.f40131h.setClickType(4);
                        splashResData.setBaseViewData(this.f40131h);
                        splashResData.seteAction(EAction.DOWNLOAD);
                        EventBus.getDefault().post(splashResData);
                        com.mbridge.msdk.shake.a.a().b(b.this.f40113f);
                    }
                } catch (Exception e10) {
                    p0.b("MBDataBinding", e10.getMessage());
                }
            }
        }
    }

    private b() {
    }

    public void d(View view) {
        a(new a(view), view.getId());
    }

    public void b(View view) {
        a(new c(view), view.getId());
    }

    public void c(View view) {
        a(new C0259b(view), view.getId());
    }

    public static b a() {
        if (f40107g == null) {
            synchronized (b.class) {
                try {
                    if (f40107g == null) {
                        f40107g = new b();
                    }
                } finally {
                }
            }
        }
        return f40107g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterBase interBase, Object obj) {
        if (interBase == null || obj == null) {
            return;
        }
        String reportDes = interBase.getReportDes();
        if (TextUtils.isEmpty(reportDes)) {
            return;
        }
        try {
            if (!(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a) || ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData() == null) {
                return;
            }
            interBase.setDynamicReport(reportDes, ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String bindDataDes = interBase.getBindDataDes();
        if (TextUtils.isEmpty(bindDataDes)) {
            return;
        }
        try {
            Object objA = com.mbridge.msdk.dycreator.utils.d.a(obj, bindDataDes);
            if (objA == null) {
                return;
            }
            if (interBase instanceof ViewGroup) {
                b((ViewGroup) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(i iVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f40108a;
        if (dVar != null) {
            dVar.a(iVar, i10);
        }
    }

    private void b(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (viewGroup != null) {
            if (viewGroup instanceof MBSplashClickView) {
                if (aVar == null || aVar.getEffectData() == null || !aVar.getEffectData().isClickButtonVisible() || aVar.getEffectData().isShakeVisible()) {
                    viewGroup.setVisibility(8);
                } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                    viewGroup.setVisibility(0);
                    ((MBSplashClickView) viewGroup).initView(obj.toString());
                }
            }
            if (viewGroup instanceof MBSplashShakeView) {
                if (aVar != null && aVar.getEffectData() != null && aVar.getEffectData().isShakeVisible()) {
                    if (obj == null || TextUtils.isEmpty(obj.toString())) {
                        return;
                    }
                    viewGroup.setVisibility(0);
                    ((MBSplashShakeView) viewGroup).initView(obj.toString());
                    return;
                }
                viewGroup.setVisibility(8);
            }
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.b bVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f40109b;
        if (cVar != null) {
            cVar.a(bVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.e eVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f40110c;
        if (fVar != null) {
            fVar.a(eVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.g gVar, int i10) {
        h hVar = this.f40111d;
        if (hVar != null) {
            hVar.a(gVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(View view) {
        if (view != 0) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (TextUtils.isEmpty(actionDes)) {
                        return;
                    }
                    if (actionDes.startsWith("click")) {
                        a(new d(view), view.getId());
                        return;
                    }
                    if (!actionDes.equals("move") && !actionDes.equals("long_click")) {
                        actionDes.equals("wobble");
                    }
                }
            } catch (Exception e10) {
                p0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    public synchronized void b() {
        try {
            com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f40109b;
            if (cVar != null) {
                cVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f40108a;
            if (dVar != null) {
                dVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f40110c;
            if (fVar != null) {
                fVar.a();
            }
            if (this.f40112e != null) {
                this.f40112e = null;
            }
            if (this.f40113f != null) {
                this.f40113f = null;
            }
            if (f40107g != null) {
                f40107g = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String effectDes = interBase.getEffectDes();
        if (TextUtils.isEmpty(effectDes)) {
            return;
        }
        try {
            if (interBase instanceof ViewGroup) {
                a((ViewGroup) interBase, (Object) effectDes, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, effectDes, obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        if (obj.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
            if (aVar.getEffectData().isShakeVisible()) {
                if (this.f40113f != null) {
                    com.mbridge.msdk.shake.a.a().b(this.f40113f);
                }
                com.mbridge.msdk.shake.a.a().a(a((View) viewGroup, (MBSplashData) aVar));
            } else if (this.f40113f != null) {
                com.mbridge.msdk.shake.a.a().b(this.f40113f);
            }
        }
        if (obj.equals("visible") && (viewGroup instanceof MBApkInfoView)) {
            if (aVar.getEffectData().isApkInfoVisible()) {
                if ((aVar instanceof MBSplashData) && !TextUtils.isEmpty(((MBSplashData) aVar).getAppInfo())) {
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(4);
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        obj.equals("anim");
    }

    private void a(View view, Object obj, Object obj2) {
        View view2;
        int countDownTime;
        boolean z10;
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        com.mbridge.msdk.dycreator.viewdata.base.a aVar = (com.mbridge.msdk.dycreator.viewdata.base.a) obj2;
        if (!obj.equals("countdown") || view == null || !(view instanceof TextView) || aVar == null) {
            view2 = view;
        } else {
            TextView textView = (TextView) view;
            String str = (String) textView.getText();
            String strP = l0.p(view.getContext());
            DyOption effectData = aVar.getEffectData();
            if (effectData != null) {
                boolean zIsCanSkip = effectData.isCanSkip();
                countDownTime = effectData.getCountDownTime();
                z10 = zIsCanSkip;
            } else {
                countDownTime = 5;
                z10 = false;
            }
            textView.setText(com.mbridge.msdk.dycreator.utils.d.a(z10, countDownTime, str, strP));
            view2 = view;
            aVar.getEffectData().setDyCountDownListenerWrapper(new e(z10, str, strP, view2));
        }
        obj.equals("anim");
        if (obj.equals("visible")) {
            if (view2 instanceof MBFeedBack) {
                if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
            }
            if (!(view2 instanceof MBLogoTextView) || aVar == null || aVar.getEffectData() == null || aVar.getEffectData().isLogoVisible()) {
                return;
            }
            ((MBLogoTextView) view2).setCompoundDrawables(null, null, null, null);
        }
    }

    private void a(View view, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (view == null || obj == null) {
            return;
        }
        try {
            if (view instanceof TextView) {
                try {
                    ((TextView) view).setText(String.valueOf(obj).replace("\\n", "\n"));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (view instanceof ImageView) {
                if (obj instanceof Integer) {
                    ((ImageView) view).setImageResource(((Integer) obj).intValue());
                }
                if (obj instanceof String) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(obj.toString(), new f(aVar, view));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Object obj) {
        if (view == null || obj == null || !(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a)) {
            return;
        }
        view.setOnClickListener(new com.mbridge.msdk.dycreator.binding.a((com.mbridge.msdk.dycreator.viewdata.base.a) obj));
    }

    public void a(BaseViewModel baseViewModel) {
        this.f40112e = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f40109b);
            this.f40112e.setConcreteSubject(this.f40108a);
            this.f40112e.setEffectSubject(this.f40110c);
            this.f40112e.setReportSubject(this.f40111d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.shake.b a(android.view.View r9, com.mbridge.msdk.dycreator.bridge.MBSplashData r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L2d
            com.mbridge.msdk.dycreator.wrapper.DyOption r0 = r10.getDyOption()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2d
            boolean r1 = r0.isShakeVisible()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2d
            com.mbridge.msdk.shake.b r1 = r8.f40113f     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L2d
            com.mbridge.msdk.dycreator.binding.b$g r2 = new com.mbridge.msdk.dycreator.binding.b$g     // Catch: java.lang.Exception -> L2a
            int r4 = r0.getShakeStrenght()     // Catch: java.lang.Exception -> L2a
            int r0 = r0.getShakeTime()     // Catch: java.lang.Exception -> L2a
            int r5 = r0 * 1000
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L27
            r3.f40113f = r2     // Catch: java.lang.Exception -> L27
            goto L38
        L27:
            r0 = move-exception
        L28:
            r9 = r0
            goto L2f
        L2a:
            r0 = move-exception
            r3 = r8
            goto L28
        L2d:
            r3 = r8
            goto L38
        L2f:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "MBDataBinding"
            com.mbridge.msdk.foundation.tools.p0.b(r10, r9)
        L38:
            com.mbridge.msdk.shake.b r9 = r3.f40113f
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.binding.b.a(android.view.View, com.mbridge.msdk.dycreator.bridge.MBSplashData):com.mbridge.msdk.shake.b");
    }
}
