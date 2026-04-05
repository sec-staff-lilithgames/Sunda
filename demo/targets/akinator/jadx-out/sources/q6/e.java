package q6;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static final void setRequiredNetworkRequest(JobInfo.Builder builder, NetworkRequest networkRequest) {
        e0.checkNotNullParameter(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
