package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public RemoteCreator(String str) {
        this.zza = str;
    }

    public abstract T getRemoteCreator(IBinder iBinder);

    public final T getRemoteCreatorInstance(Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new RemoteCreatorException("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new RemoteCreatorException("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new RemoteCreatorException("Could not instantiate creator.", e12);
            }
        }
        return (T) this.zzb;
    }
}
