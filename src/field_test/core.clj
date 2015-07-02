(ns field-test.core
  (:import [java.util UUID]))

(defrecord UUIDWrapper [^UUID uuid])

(defn unwrap [^UUIDWrapper w]
  (.-uuid w)) ; <- No reflection

(defn get-lower-bits [^UUIDWrapper w]
  (-> w .-uuid .getLeastSignificantBits)) ; <- Reflection :(
