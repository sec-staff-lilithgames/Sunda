package jh;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a {
    public static a create(int i10, int i11, int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new b(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static a zzd(Bundle bundle) {
        return new b(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract List a();

    public abstract List b();

    public abstract long bytesDownloaded();

    public abstract List c();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int iStatus = status();
        return iStatus == 0 || iStatus == 5 || iStatus == 6 || iStatus == 7;
    }

    public List<String> languages() {
        return a() != null ? new ArrayList(a()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return b() != null ? new ArrayList(b()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();
}
