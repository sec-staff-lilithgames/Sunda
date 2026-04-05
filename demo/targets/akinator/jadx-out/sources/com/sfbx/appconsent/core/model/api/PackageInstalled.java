package com.sfbx.appconsent.core.model.api;

import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class PackageInstalled {
    public static final Companion Companion = new Companion(null);
    private final long collectTimestamp;
    private final long installTimestamp;
    private final String packageName;
    private final long updateTimestamp;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<PackageInstalled> serializer() {
            return PackageInstalled$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ PackageInstalled(int i10, String str, long j10, long j11, long j12, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, PackageInstalled$$serializer.INSTANCE.getDescriptor());
        }
        this.packageName = str;
        this.collectTimestamp = j10;
        this.installTimestamp = j11;
        this.updateTimestamp = j12;
    }

    public static /* synthetic */ PackageInstalled copy$default(PackageInstalled packageInstalled, String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = packageInstalled.packageName;
        }
        if ((i10 & 2) != 0) {
            j10 = packageInstalled.collectTimestamp;
        }
        if ((i10 & 4) != 0) {
            j11 = packageInstalled.installTimestamp;
        }
        if ((i10 & 8) != 0) {
            j12 = packageInstalled.updateTimestamp;
        }
        long j13 = j12;
        return packageInstalled.copy(str, j10, j11, j13);
    }

    public static final void write$Self(PackageInstalled self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.packageName);
        output.encodeLongElement(serialDesc, 1, self.collectTimestamp);
        output.encodeLongElement(serialDesc, 2, self.installTimestamp);
        output.encodeLongElement(serialDesc, 3, self.updateTimestamp);
    }

    public final String component1() {
        return this.packageName;
    }

    public final long component2() {
        return this.collectTimestamp;
    }

    public final long component3() {
        return this.installTimestamp;
    }

    public final long component4() {
        return this.updateTimestamp;
    }

    public final PackageInstalled copy(String packageName, long j10, long j11, long j12) {
        e0.checkNotNullParameter(packageName, "packageName");
        return new PackageInstalled(packageName, j10, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInstalled)) {
            return false;
        }
        PackageInstalled packageInstalled = (PackageInstalled) obj;
        return e0.areEqual(this.packageName, packageInstalled.packageName) && this.collectTimestamp == packageInstalled.collectTimestamp && this.installTimestamp == packageInstalled.installTimestamp && this.updateTimestamp == packageInstalled.updateTimestamp;
    }

    public final long getCollectTimestamp() {
        return this.collectTimestamp;
    }

    public final long getInstallTimestamp() {
        return this.installTimestamp;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.updateTimestamp) + o2.d(o2.d(this.packageName.hashCode() * 31, 31, this.collectTimestamp), 31, this.installTimestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PackageInstalled(packageName=");
        sb2.append(this.packageName);
        sb2.append(", collectTimestamp=");
        sb2.append(this.collectTimestamp);
        sb2.append(", installTimestamp=");
        sb2.append(this.installTimestamp);
        sb2.append(", updateTimestamp=");
        return g.n(sb2, this.updateTimestamp, ')');
    }

    public PackageInstalled(String packageName, long j10, long j11, long j12) {
        e0.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.collectTimestamp = j10;
        this.installTimestamp = j11;
        this.updateTimestamp = j12;
    }
}
