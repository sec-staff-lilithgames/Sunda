package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import b0.e2;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f41826v;

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f41827w;

    /* renamed from: x, reason: collision with root package name */
    private CopyOnWriteArrayList<e> f41828x;

    /* renamed from: y, reason: collision with root package name */
    private String f41829y;

    /* renamed from: z, reason: collision with root package name */
    private String f41830z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements CommonWebView.i {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.i
        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b(collapsibleWebView.f41846j, str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        Boolean f41834a = Boolean.FALSE;

        /* renamed from: b, reason: collision with root package name */
        String f41835b = "";

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f41834a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a((View) webView, str);
            this.f41834a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f41835b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            HashMap map = new HashMap();
            map.put("type", "error");
            map.put("url", str2);
            map.put("description", str);
            if (!this.f41834a.booleanValue() && this.f41835b.equals(str2)) {
                this.f41834a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap mapS = e2.s("type", "http");
            String str = webResourceRequest.getUrl() + "";
            mapS.put("url", str);
            mapS.put("statusCode", webResourceResponse.getStatusCode() + "");
            mapS.put("description", "http error");
            if (!this.f41834a.booleanValue() && (this.f41835b.equals(str) || TextUtils.isEmpty(this.f41835b))) {
                this.f41834a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, mapS);
            }
            CollapsibleWebView.this.a(webView, mapS);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap mapS = e2.s("type", "ssl");
            mapS.put("url", sslError.getUrl());
            mapS.put("description", "ssl error");
            if (!this.f41834a.booleanValue()) {
                if (this.f41835b.equals(sslError.getUrl() + "")) {
                    this.f41834a = Boolean.TRUE;
                    CollapsibleWebView.this.b(webView, mapS);
                }
            }
            CollapsibleWebView.this.a(webView, mapS);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            p0.b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.f41826v.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.f41827w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("mbridge_arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("mbridge_arrow_up_black").a(new b());
    }

    public String getCollapseIconName() {
        return this.f41829y;
    }

    public String getExpandIconName() {
        return this.f41830z;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() throws Resources.NotFoundException {
        super.init();
        this.f41826v = new CopyOnWriteArrayList<>();
        this.f41827w = new CopyOnWriteArrayList<>();
        this.f41828x = new CopyOnWriteArrayList<>();
        this.f41829y = "mbridge_arrow_down_white_blackbg";
        this.f41830z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    public void setCollapseIconName(String str) {
        this.f41829y = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.f41826v.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i10, int i11, int i12, int i13) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f41839c.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f41839c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f41830z = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.f41827w.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.f41828x.add(eVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.f41828x.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.f41828x.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.f41828x.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.f41828x.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}
