package nm;

import android.os.Handler;
import android.text.TextUtils;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.inmobi.media.C3031v1;
import com.ironsource.C3271ic;
import com.mbridge.msdk.foundation.download.Command;
import io.bidmachine.UserAgentManager;
import java.net.HttpURLConnection;
import java.net.URL;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f77049c;

    public /* synthetic */ i(String str, int i10) {
        this.f77048b = i10;
        this.f77049c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        int i10 = this.f77048b;
        HttpURLConnection httpURLConnection3 = null;
        String str = this.f77049c;
        switch (i10) {
            case 0:
                Handler handler = j.f77050a;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setRequestMethod(C3271ic.f36943a);
                    String userAgent = UserAgentManager.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, userAgent);
                    }
                    httpURLConnection.getResponseCode();
                    try {
                        j.close(httpURLConnection.getInputStream());
                    } catch (Exception e11) {
                        a.w(e11);
                    }
                    lr.a.disconnectSafely(httpURLConnection);
                } catch (Exception e12) {
                    e = e12;
                    httpURLConnection3 = httpURLConnection;
                    a.w(e);
                    if (httpURLConnection3 != null) {
                        try {
                            j.close(httpURLConnection3.getInputStream());
                        } catch (Exception e13) {
                            a.w(e13);
                        }
                    }
                    lr.a.disconnectSafely(httpURLConnection3);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection3 = httpURLConnection;
                    if (httpURLConnection3 != null) {
                        try {
                            j.close(httpURLConnection3.getInputStream());
                        } catch (Exception e14) {
                            a.w(e14);
                        }
                    }
                    lr.a.disconnectSafely(httpURLConnection3);
                    throw th;
                }
                return;
            case 1:
                int i11 = OneCharacterProposalActivity.S;
                w9.e.getInstance().speak(str);
                return;
            case 2:
                int i12 = QuestionActivity.f21703n0;
                w9.e.getInstance().speak(str);
                return;
            case 3:
                Handler handler2 = h0.f88588a;
                try {
                    try {
                        um.j.d("Utils", "Connection to URL: %s", str);
                        httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                try {
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setRequestProperty("Connection", "close");
                    httpURLConnection2.setRequestMethod(C3271ic.f36943a);
                    String userAgent2 = zp.a.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent2)) {
                        httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, userAgent2);
                    }
                    um.j.d("Utils", "Response code: %d, for URL: %s", Integer.valueOf(httpURLConnection2.getResponseCode()), str);
                } catch (Exception e16) {
                    e = e16;
                    httpURLConnection3 = httpURLConnection2;
                    um.j.e("Utils", "%s: %s: %s", str, e.getMessage(), e.toString());
                    httpURLConnection2 = httpURLConnection3;
                    lr.a.disconnectSafely(httpURLConnection2);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection3 = httpURLConnection2;
                    lr.a.disconnectSafely(httpURLConnection3);
                    throw th;
                }
                lr.a.disconnectSafely(httpURLConnection2);
                return;
            default:
                C3031v1.b(str);
                return;
        }
    }
}
