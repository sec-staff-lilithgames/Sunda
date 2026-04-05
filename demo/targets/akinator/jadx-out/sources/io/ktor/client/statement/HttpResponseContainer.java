package io.ktor.client.statement;

import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpResponseContainer {
    private final TypeInfo expectedType;
    private final Object response;

    public HttpResponseContainer(TypeInfo expectedType, Object response) {
        e0.checkNotNullParameter(expectedType, "expectedType");
        e0.checkNotNullParameter(response, "response");
        this.expectedType = expectedType;
        this.response = response;
    }

    public static /* synthetic */ HttpResponseContainer copy$default(HttpResponseContainer httpResponseContainer, TypeInfo typeInfo, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            typeInfo = httpResponseContainer.expectedType;
        }
        if ((i10 & 2) != 0) {
            obj = httpResponseContainer.response;
        }
        return httpResponseContainer.copy(typeInfo, obj);
    }

    public final TypeInfo component1() {
        return this.expectedType;
    }

    public final Object component2() {
        return this.response;
    }

    public final HttpResponseContainer copy(TypeInfo expectedType, Object response) {
        e0.checkNotNullParameter(expectedType, "expectedType");
        e0.checkNotNullParameter(response, "response");
        return new HttpResponseContainer(expectedType, response);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponseContainer)) {
            return false;
        }
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) obj;
        return e0.areEqual(this.expectedType, httpResponseContainer.expectedType) && e0.areEqual(this.response, httpResponseContainer.response);
    }

    public final TypeInfo getExpectedType() {
        return this.expectedType;
    }

    public final Object getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.expectedType.hashCode() * 31);
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.expectedType + ", response=" + this.response + ')';
    }
}
