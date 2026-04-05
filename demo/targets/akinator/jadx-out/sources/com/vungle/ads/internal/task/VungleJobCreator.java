package com.vungle.ads.internal.task;

import a.b;
import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleJobCreator implements JobCreator {
    private final Context context;
    private final PathProvider pathProvider;

    public VungleJobCreator(Context context, PathProvider pathProvider) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.JobCreator
    public Job create(String tag) throws UnknownTagException {
        e0.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            throw new UnknownTagException("Job tag is null");
        }
        if (e0.areEqual(tag, CleanupJob.TAG)) {
            return new CleanupJob(this.context, this.pathProvider);
        }
        if (e0.areEqual(tag, ResendTpatJob.TAG)) {
            return new ResendTpatJob(this.context, this.pathProvider);
        }
        throw new UnknownTagException(b.k("Unknown Job Type ", tag));
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }
}
