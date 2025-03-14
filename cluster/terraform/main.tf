terraform {
  required_providers {
    kubernetes = {
      source  = "hashicorp/kubernetes"
      version = "2.35.0"
    }
  }
}
provider "kubernetes" {
  config_path = "kubeconfig.yaml"
}

provider "helm" {
  kubernetes {
    config_path = "kubeconfig.yaml"
  }
}

module "create_argocd" {
  source = "./argocd"
  argocd_namespace = "argocd"
}