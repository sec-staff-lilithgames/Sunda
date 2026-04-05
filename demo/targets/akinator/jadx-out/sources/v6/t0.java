package v6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.f;
import n6.x0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 {
    public static final int backoffPolicyToInt(n6.a backoffPolicy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = s0.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new tu.t();
    }

    public static final Set<f.c> byteArrayToSetOfTriggers(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            int i10 = objectInputStream.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean z10 = objectInputStream.readBoolean();
                kotlin.jvm.internal.e0.checkNotNull(uri);
                linkedHashSet.add(new f.c(uri, z10));
            }
            gv.d.closeFinally(objectInputStream, null);
            gv.d.closeFinally(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final byte[] fromNetworkRequest$work_runtime_release(w6.r requestCompat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = requestCompat.getNetworkRequest();
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] transportTypesCompat = w6.s.getTransportTypesCompat(networkRequest);
                int[] capabilitiesCompat = w6.s.getCapabilitiesCompat(networkRequest);
                objectOutputStream.writeInt(transportTypesCompat.length);
                for (int i10 : transportTypesCompat) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(capabilitiesCompat.length);
                for (int i11 : capabilitiesCompat) {
                    objectOutputStream.writeInt(i11);
                }
                gv.d.closeFinally(objectOutputStream, null);
                gv.d.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final n6.a intToBackoffPolicy(int i10) {
        if (i10 == 0) {
            return n6.a.f75680b;
        }
        if (i10 == 1) {
            return n6.a.f75681c;
        }
        throw new IllegalArgumentException(o2.k(i10, "Could not convert ", " to BackoffPolicy"));
    }

    public static final n6.d0 intToNetworkType(int i10) {
        if (i10 == 0) {
            return n6.d0.f75705b;
        }
        if (i10 == 1) {
            return n6.d0.f75706c;
        }
        if (i10 == 2) {
            return n6.d0.f75707e;
        }
        if (i10 == 3) {
            return n6.d0.f75708f;
        }
        if (i10 == 4) {
            return n6.d0.f75709g;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(o2.k(i10, "Could not convert ", " to NetworkType"));
        }
        return n6.d0.f75710h;
    }

    public static final n6.o0 intToOutOfQuotaPolicy(int i10) {
        if (i10 == 0) {
            return n6.o0.f75776b;
        }
        if (i10 == 1) {
            return n6.o0.f75777c;
        }
        throw new IllegalArgumentException(o2.k(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final x0 intToState(int i10) {
        if (i10 == 0) {
            return x0.f75806b;
        }
        if (i10 == 1) {
            return x0.f75807c;
        }
        if (i10 == 2) {
            return x0.f75808e;
        }
        if (i10 == 3) {
            return x0.f75809f;
        }
        if (i10 == 4) {
            return x0.f75810g;
        }
        if (i10 == 5) {
            return x0.f75811h;
        }
        throw new IllegalArgumentException(o2.k(i10, "Could not convert ", " to State"));
    }

    public static final int networkTypeToInt(n6.d0 networkType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkType, "networkType");
        int iOrdinal = networkType.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && networkType == n6.d0.f75710h) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                }
            }
        }
        return i10;
    }

    public static final int outOfQuotaPolicyToInt(n6.o0 policy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(policy, "policy");
        int i10 = s0.$EnumSwitchMapping$3[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new tu.t();
    }

    public static final byte[] setOfTriggersToByteArray(Set<f.c> triggers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (f.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.isTriggeredForDescendants());
                }
                gv.d.closeFinally(objectOutputStream, null);
                gv.d.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int stateToInt(x0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        switch (s0.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new tu.t();
        }
    }

    public static final w6.r toNetworkRequest$work_runtime_release(byte[] bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new w6.r(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                w6.r rVarCreateNetworkRequestCompat$work_runtime_release = w6.o.f90427a.createNetworkRequestCompat$work_runtime_release(iArr2, iArr);
                gv.d.closeFinally(objectInputStream, null);
                gv.d.closeFinally(byteArrayInputStream, null);
                return rVarCreateNetworkRequestCompat$work_runtime_release;
            } finally {
            }
        } finally {
        }
    }
}
