package com.sfbx.appconsentv3.ui.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class Response<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Error<T> extends Response<T> {
        private final Throwable error;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error, String message) {
            super(null);
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(message, "message");
            this.error = error;
            this.message = message;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = error.error;
            }
            if ((i10 & 2) != 0) {
                str = error.message;
            }
            return error.copy(th2, str);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Error<T> copy(Throwable error, String message) {
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(message, "message");
            return new Error<>(error, message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return e0.areEqual(this.error, error.error) && e0.areEqual(this.message, error.message);
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.error);
            sb2.append(", message=");
            return o2.q(sb2, this.message, ')');
        }

        public /* synthetic */ Error(Throwable th2, String str, int i10, u uVar) {
            this(th2, (i10 & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Loading<T> extends Response<T> {
        public Loading() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Success<T> extends Response<T> {
        private final T data;

        public Success(T t10) {
            super(null);
            this.data = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t10) {
            return new Success<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && e0.areEqual(this.data, ((Success) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t10 = this.data;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    public /* synthetic */ Response(u uVar) {
        this();
    }

    private Response() {
    }
}
