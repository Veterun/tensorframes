// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/config.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.GraphOptions}
 */
public  final class GraphOptions extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.GraphOptions)
    GraphOptionsOrBuilder {
  // Use GraphOptions.newBuilder() to construct.
  private GraphOptions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GraphOptions() {
    enableRecvScheduling_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GraphOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 16: {

            enableRecvScheduling_ = input.readBool();
            break;
          }
          case 26: {
            org.tensorflow.framework.OptimizerOptions.Builder subBuilder = null;
            if (optimizerOptions_ != null) {
              subBuilder = optimizerOptions_.toBuilder();
            }
            optimizerOptions_ = input.readMessage(org.tensorflow.framework.OptimizerOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(optimizerOptions_);
              optimizerOptions_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_GraphOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_GraphOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.GraphOptions.class, org.tensorflow.framework.GraphOptions.Builder.class);
  }

  public static final int ENABLE_RECV_SCHEDULING_FIELD_NUMBER = 2;
  private boolean enableRecvScheduling_;
  /**
   * <code>optional bool enable_recv_scheduling = 2;</code>
   *
   * <pre>
   * If true, use control flow to schedule the activation of Recv nodes.
   * (Currently ignored.)
   * </pre>
   */
  public boolean getEnableRecvScheduling() {
    return enableRecvScheduling_;
  }

  public static final int OPTIMIZER_OPTIONS_FIELD_NUMBER = 3;
  private org.tensorflow.framework.OptimizerOptions optimizerOptions_;
  /**
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   *
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   */
  public boolean hasOptimizerOptions() {
    return optimizerOptions_ != null;
  }
  /**
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   *
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   */
  public org.tensorflow.framework.OptimizerOptions getOptimizerOptions() {
    return optimizerOptions_ == null ? org.tensorflow.framework.OptimizerOptions.getDefaultInstance() : optimizerOptions_;
  }
  /**
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   *
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   */
  public org.tensorflow.framework.OptimizerOptionsOrBuilder getOptimizerOptionsOrBuilder() {
    return getOptimizerOptions();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (enableRecvScheduling_ != false) {
      output.writeBool(2, enableRecvScheduling_);
    }
    if (optimizerOptions_ != null) {
      output.writeMessage(3, getOptimizerOptions());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableRecvScheduling_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableRecvScheduling_);
    }
    if (optimizerOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOptimizerOptions());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.tensorflow.framework.GraphOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.tensorflow.framework.GraphOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.GraphOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.GraphOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.GraphOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GraphOptions)
      org.tensorflow.framework.GraphOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_GraphOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_GraphOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.GraphOptions.class, org.tensorflow.framework.GraphOptions.Builder.class);
    }

    // Construct using org.tensorflow.framework.GraphOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      enableRecvScheduling_ = false;

      if (optimizerOptionsBuilder_ == null) {
        optimizerOptions_ = null;
      } else {
        optimizerOptions_ = null;
        optimizerOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_GraphOptions_descriptor;
    }

    public org.tensorflow.framework.GraphOptions getDefaultInstanceForType() {
      return org.tensorflow.framework.GraphOptions.getDefaultInstance();
    }

    public org.tensorflow.framework.GraphOptions build() {
      org.tensorflow.framework.GraphOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.GraphOptions buildPartial() {
      org.tensorflow.framework.GraphOptions result = new org.tensorflow.framework.GraphOptions(this);
      result.enableRecvScheduling_ = enableRecvScheduling_;
      if (optimizerOptionsBuilder_ == null) {
        result.optimizerOptions_ = optimizerOptions_;
      } else {
        result.optimizerOptions_ = optimizerOptionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.GraphOptions) {
        return mergeFrom((org.tensorflow.framework.GraphOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.GraphOptions other) {
      if (other == org.tensorflow.framework.GraphOptions.getDefaultInstance()) return this;
      if (other.getEnableRecvScheduling() != false) {
        setEnableRecvScheduling(other.getEnableRecvScheduling());
      }
      if (other.hasOptimizerOptions()) {
        mergeOptimizerOptions(other.getOptimizerOptions());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.GraphOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.GraphOptions) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableRecvScheduling_ ;
    /**
     * <code>optional bool enable_recv_scheduling = 2;</code>
     *
     * <pre>
     * If true, use control flow to schedule the activation of Recv nodes.
     * (Currently ignored.)
     * </pre>
     */
    public boolean getEnableRecvScheduling() {
      return enableRecvScheduling_;
    }
    /**
     * <code>optional bool enable_recv_scheduling = 2;</code>
     *
     * <pre>
     * If true, use control flow to schedule the activation of Recv nodes.
     * (Currently ignored.)
     * </pre>
     */
    public Builder setEnableRecvScheduling(boolean value) {
      
      enableRecvScheduling_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enable_recv_scheduling = 2;</code>
     *
     * <pre>
     * If true, use control flow to schedule the activation of Recv nodes.
     * (Currently ignored.)
     * </pre>
     */
    public Builder clearEnableRecvScheduling() {
      
      enableRecvScheduling_ = false;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.OptimizerOptions optimizerOptions_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.framework.OptimizerOptions, org.tensorflow.framework.OptimizerOptions.Builder, org.tensorflow.framework.OptimizerOptionsOrBuilder> optimizerOptionsBuilder_;
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public boolean hasOptimizerOptions() {
      return optimizerOptionsBuilder_ != null || optimizerOptions_ != null;
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public org.tensorflow.framework.OptimizerOptions getOptimizerOptions() {
      if (optimizerOptionsBuilder_ == null) {
        return optimizerOptions_ == null ? org.tensorflow.framework.OptimizerOptions.getDefaultInstance() : optimizerOptions_;
      } else {
        return optimizerOptionsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public Builder setOptimizerOptions(org.tensorflow.framework.OptimizerOptions value) {
      if (optimizerOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        optimizerOptions_ = value;
        onChanged();
      } else {
        optimizerOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public Builder setOptimizerOptions(
        org.tensorflow.framework.OptimizerOptions.Builder builderForValue) {
      if (optimizerOptionsBuilder_ == null) {
        optimizerOptions_ = builderForValue.build();
        onChanged();
      } else {
        optimizerOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public Builder mergeOptimizerOptions(org.tensorflow.framework.OptimizerOptions value) {
      if (optimizerOptionsBuilder_ == null) {
        if (optimizerOptions_ != null) {
          optimizerOptions_ =
            org.tensorflow.framework.OptimizerOptions.newBuilder(optimizerOptions_).mergeFrom(value).buildPartial();
        } else {
          optimizerOptions_ = value;
        }
        onChanged();
      } else {
        optimizerOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public Builder clearOptimizerOptions() {
      if (optimizerOptionsBuilder_ == null) {
        optimizerOptions_ = null;
        onChanged();
      } else {
        optimizerOptions_ = null;
        optimizerOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public org.tensorflow.framework.OptimizerOptions.Builder getOptimizerOptionsBuilder() {
      
      onChanged();
      return getOptimizerOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    public org.tensorflow.framework.OptimizerOptionsOrBuilder getOptimizerOptionsOrBuilder() {
      if (optimizerOptionsBuilder_ != null) {
        return optimizerOptionsBuilder_.getMessageOrBuilder();
      } else {
        return optimizerOptions_ == null ?
            org.tensorflow.framework.OptimizerOptions.getDefaultInstance() : optimizerOptions_;
      }
    }
    /**
     * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
     *
     * <pre>
     * Options controlling how graph is optimized.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.framework.OptimizerOptions, org.tensorflow.framework.OptimizerOptions.Builder, org.tensorflow.framework.OptimizerOptionsOrBuilder> 
        getOptimizerOptionsFieldBuilder() {
      if (optimizerOptionsBuilder_ == null) {
        optimizerOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.tensorflow.framework.OptimizerOptions, org.tensorflow.framework.OptimizerOptions.Builder, org.tensorflow.framework.OptimizerOptionsOrBuilder>(
                getOptimizerOptions(),
                getParentForChildren(),
                isClean());
        optimizerOptions_ = null;
      }
      return optimizerOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.GraphOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GraphOptions)
  private static final org.tensorflow.framework.GraphOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.GraphOptions();
  }

  public static org.tensorflow.framework.GraphOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphOptions>
      PARSER = new com.google.protobuf.AbstractParser<GraphOptions>() {
    public GraphOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GraphOptions(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<GraphOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphOptions> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.GraphOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

