terraform {
  required_providers {
    helm = {
      source  = "hashicorp/helm"
      version = "2.17.0"
    }
  }
}


resource "helm_release" "argocd" {
  name       = "argocd"
  repository = "https://argoproj.github.io/argo-helm"
  chart      = "argo-cd"
  namespace  = "${var.argocd_namespace}"
  version = "7.8.5"
  create_namespace = true
  values = [
    <<EOF
server:
  service:
    type: LoadBalancer
    nodePortHttp: 30080
    nodePortHttps: 30443
EOF
  ]
}