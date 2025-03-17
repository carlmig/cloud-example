## Initial Setup

* Installed minikube
* Installed Helm
* Config docker to use minikube registry

```
eval $(minikube docker-env)
``


## Using Helm

### Installing 3rd party

```
helm repo add bitnami https://charts.bitnami.com/bitnami
helm repo update
helm repo list

helm install kube-state-metrics bitnami/kube-state-metrics -n metrics
helm ls -n metrics
```

### Create namespace

```
kubectl create ns metrics
```


### Look into installed chart

```
helm show chart bitnami/kube-state-metrics
helm show values bitnami/kube-state-metrics
```

### Create a new chart

```
helm create helm-mario-jokes
```

### Install a chart

```
helm install mario-jokes .
```


### Update a deployed chart

```
helm upgrade mario-jokes .
```


## Access local

* Make sure the service is in mode NodePort
* Check the service port
* Create a tunnel for it with minikube

```
minikube service mario-jokes-helm-mario-jokes --url
```

## ArgoCD

In order to access ArgoCD Web UI you can use the following minikube command:
```
minikube service list
```

### Username and password
Username is *admin* and the password can be obtained from the secret * argocd-initial-admin-secret* with kubectl:

```
kubectl get secret argocd-initial-admin-secret -n argocd -o jsonpath="{.data.password}" | base64 -d
```