package com.sfbx.appconsent.core.model.reducer;

import com.google.protobuf.Timestamp;
import com.sfbx.appconsent.core.model.reducer.custom_serializable.TimeStampProtoSerializable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class EventReducer {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final Timestamp timestamp;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<EventReducer> serializer() {
            return EventReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ EventReducer(int i10, @SerialName("name") String str, @Serializable(with = TimeStampProtoSerializable.class) Timestamp timestamp, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, EventReducer$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ EventReducer copy$default(EventReducer eventReducer, String str, Timestamp timestamp, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventReducer.name;
        }
        if ((i10 & 2) != 0) {
            timestamp = eventReducer.timestamp;
        }
        return eventReducer.copy(str, timestamp);
    }

    public static final void write$Self(EventReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeSerializableElement(serialDesc, 1, TimeStampProtoSerializable.INSTANCE, self.timestamp);
    }

    public final String component1() {
        return this.name;
    }

    public final Timestamp component2() {
        return this.timestamp;
    }

    public final EventReducer copy(String name, Timestamp timestamp) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(timestamp, "timestamp");
        return new EventReducer(name, timestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventReducer)) {
            return false;
        }
        EventReducer eventReducer = (EventReducer) obj;
        return e0.areEqual(this.name, eventReducer.name) && e0.areEqual(this.timestamp, eventReducer.timestamp);
    }

    public final String getName() {
        return this.name;
    }

    public final Timestamp getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "EventReducer(name=" + this.name + ", timestamp=" + this.timestamp + ')';
    }

    public EventReducer(String name, Timestamp timestamp) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(timestamp, "timestamp");
        this.name = name;
        this.timestamp = timestamp;
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @Serializable(with = TimeStampProtoSerializable.class)
    public static /* synthetic */ void getTimestamp$annotations() {
    }
}
