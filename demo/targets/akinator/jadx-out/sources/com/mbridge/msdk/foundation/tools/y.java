package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j1.o2;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    static final List<String> f41208a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z10);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f41208a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r14 != 5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r14, java.lang.String r15, java.lang.String r16, com.mbridge.msdk.foundation.tools.y.c r17, com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.y.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.y$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i10, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String path = new URL(str2).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    return strSubstring.replace(".zip", "");
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = new URL(str).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    String strReplace = strSubstring.replace(".zip", "");
                    List<String> list = f41208a;
                    if (list != null) {
                        if (!list.contains(strReplace)) {
                            return strReplace;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements OnDownloadStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f41211c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f41212d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f41213e;

        public a(String str, String str2, c cVar, String str3, String str4) {
            this.f41209a = str;
            this.f41210b = str2;
            this.f41211c = cVar;
            this.f41212d = str3;
            this.f41213e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f41209a + File.separator + this.f41210b;
                String str3 = this.f41209a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.f41211c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            p0.b("DynamicViewResourceManager", th2.getMessage());
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.f41211c.a(this.f41212d, str3, this.f41213e, str, false);
                    } catch (Exception e10) {
                        p0.b("DynamicViewResourceManager", e10.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.f41211c;
            if (cVar != null) {
                try {
                    cVar.a(this.f41212d, downloadError);
                } catch (Exception e10) {
                    p0.b("DynamicViewResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements OnDownloadStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41215b;

        public b(String str, String str2) {
            this.f41214a = str;
            this.f41215b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f41214a + File.separator + this.f41215b, this.f41214a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }
    }

    public static String a(int i10, String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strB = b(i10, str, str2);
        } catch (Exception unused) {
            strB = "";
        }
        String str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        File file = !TextUtils.isEmpty(strB) ? new File(str3, strB) : null;
        if (file == null || !file.exists()) {
            file = new File(o2.o(p0.o2.u(str3), File.separator, strB.replace(".xml", "")), strB);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String strB;
        String str2;
        File file;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.equals("1")) {
                    return "";
                }
            }
        } catch (Throwable unused) {
        }
        try {
            strB = b(str);
        } catch (Exception unused2) {
            strB = "";
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            str2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            file = new File(str2, strB);
        } catch (Exception unused3) {
        }
        if (file.isFile() && file.exists()) {
            return file.getPath();
        }
        String path = new URL(str).getPath();
        a(str, path.substring(path.lastIndexOf(47) + 1), str2, strB);
        return "";
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i10) throws Exception {
        p0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i10));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.f40724u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.f40723t).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.f40722s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f40724u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f40718o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.f40722s).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
